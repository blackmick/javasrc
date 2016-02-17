package com.shawn.finance.assetmanagement.config;

import com.shawn.finance.assetmanagement.interceptor.RequestInterceptor;
import org.apache.commons.dbcp.BasicDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import javax.sql.DataSource;

/**
 * Created by shawn on 16/1/18.
 */
@Configuration
@ComponentScan(basePackages = "com.shawn.finance.assetmanagement")
@MapperScan(basePackages = "com.shawn.finance.assetmanagement.dao.mapper")
public class AssetManagementConfig extends WebMvcConfigurerAdapter {
//    private static Logger logger = LoggerFactory.getLogger(FsmDemoConfig.class);

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
        dataSource.setUrl("jdbc:mysql://127.0.0.1:3306/asset_management");
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
//        sqlSessionFactory.getObject().getConfiguration().getTypeHandlerRegistry().register(States.class, JdbcType.INTEGER, new EnumOrdinalTypeHandler<States>);
        return sqlSessionFactory.getObject();
    }
}
