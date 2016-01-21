package com.shawn.finance.fsmdemo.service;

import com.shawn.finance.fsmdemo.dao.mapper.ProductMapper;
import com.shawn.finance.fsmdemo.model.po.Product;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by shawn on 16/1/21.
 */
public class ProductService {
    @Autowired
    private static ProductMapper productDao;

    private ProductService(){};

    public static Product getProduct(Long id){
        return productDao.getById(id);
    }
}
