package com.shawn.finance.fsmdemo.config;

import com.shawn.finance.fsmdemo.interceptor.RequestInterceptor;
import org.apache.commons.dbcp.BasicDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.mapper.MapperFactoryBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import javax.sql.DataSource;

/**
 * Created by shawn on 16/1/18.
 */
@Configuration

@MapperScan(basePackages = "com.shawn.finance.fsmdemo.dao.mapper")
public class FsmDemoConfig extends WebMvcConfigurerAdapter {
    private static Logger logger = LoggerFactory.getLogger(FsmDemoConfig.class);

    public HandlerInterceptor getInterceptor(){
        return new RequestInterceptor();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry){
        registry.addInterceptor(getInterceptor());
    }

    @Bean
    public DataSource dataSource(){
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("mysql://127.0.0.1:3306/fsmdemo");
        dataSource.setUsername("root");
        dataSource.setPassword("root");

        return dataSource;
    }

    @Bean
    public DataSourceTransactionManager transactionManager(){
        return new DataSourceTransactionManager(dataSource());
    }

    @Bean
    public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception{
        SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
        sqlSessionFactory.setDataSource(dataSource);
        sqlSessionFactory.getObject().getConfiguration().setMapUnderscoreToCamelCase(true);
        return sqlSessionFactory.getObject();
    }

    private <T> MapperFactoryBean getMapper(Class<T> mapperInterface){
        MapperFactoryBean<T> mapperFactoryBean = new MapperFactoryBean<T>();
        try{
            mapperFactoryBean.setSqlSessionFactory(sqlSessionFactory(dataSource()));
            mapperFactoryBean.setMapperInterface(mapperInterface);
        }catch (Exception ex){
            logger.error("error when create mapper", ex);
            throw new RuntimeException(ex);
        }

        return mapperFactoryBean;
    }
}
