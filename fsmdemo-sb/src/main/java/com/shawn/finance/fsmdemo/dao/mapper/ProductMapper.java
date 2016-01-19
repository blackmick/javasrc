package com.shawn.finance.fsmdemo.dao.mapper;

import com.shawn.finance.fsmdemo.model.po.Product;

/**
 * Created by shawn on 16/1/18.
 */
public interface ProductMapper {
    void addProduct();
    Product getById(Long id);

}
