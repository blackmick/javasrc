package com.shawn.finance.fsmdemo.dao.mapper;

import com.shawn.finance.fsmdemo.dao.typehandler.EnumEventTypeHandler;
import com.shawn.finance.fsmdemo.dao.typehandler.EnumStateTypeHandler;
import com.shawn.finance.fsmdemo.fsm.Events;
import com.shawn.finance.fsmdemo.fsm.States;
import com.shawn.finance.fsmdemo.model.po.Product;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

/**
 * Created by shawn on 16/1/18.
 */
//@Component
//    @Repository("productDao")
public interface ProductMapper {

    @Insert("INSERT INTO tbl_product (state, last_event) VALUES (#{state, typeHandler=com.shawn.finance.fsmdemo.dao.typehandler.EnumStateTypeHandler}, #{lastEvent, typeHandler=com.shawn.finance.fsmdemo.dao.typehandler.EnumEventTypeHandler})")
    void addProduct(Product product);

    @Select("SELECT * FROM tbl_product WHERE id=#{id}")
    @Results(
            {
                    @Result(id = true, column = "id", property = "id", javaType = Long.class, jdbcType = JdbcType.BIGINT),
                    @Result(column = "state", property = "state", javaType = States.class, jdbcType = JdbcType.INTEGER, typeHandler = EnumStateTypeHandler.class),
                    @Result(column = "last_event", property = "lastEvent", javaType = Events.class, jdbcType = JdbcType.INTEGER, typeHandler = EnumEventTypeHandler.class)
            }
    )
    Product getById(Long id);

    @Select("SELECT state FROM tbl_product WHERE id = #{id}")
    States getStateById(Long id);

    @Update("UPDATE tbl_product SET state=#{state typeHandler=com.shawn.finance.fsmdemo.dao.typehandler.EnumStateTypeHandler}, last_event=#{lastEvent typeHandler=com.shawn.finance.fsmdemo.dao.typehandler.EnumEventTypeHandler} WHERE id = #{id)")
    void updateState(Product product, States state);
}
