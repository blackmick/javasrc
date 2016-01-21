package com.shawn.finance.fsmdemo.dao.mapper;

import com.shawn.finance.fsmdemo.fsm.States;
import com.shawn.finance.fsmdemo.model.po.Product;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

/**
 * Created by shawn on 16/1/18.
 */

public interface ProductMapper {
    @Insert("INSERT INTO tbl_product (state, last_event) VALUES (#{state}, #{lastEvent})")
    void addProduct(Product product);

    @Select("SELECT * FROM tbl_product WHERE id=#{id}")
    Product getById(Long id);

    @Select("SELECT state FROM tbl_product WHERE id = #{id}")
    States getStateById(Long id);

    @Update("UPDATE tbl_product SET state=#{state}, last_event=#{lastEvent} WHERE id = #{id)")
    void updateState(Product product, States state);
}
