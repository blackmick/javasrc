package com.shawn.finance.fsmdemo.service;

import com.shawn.finance.fsmdemo.dao.mapper.ProductMapper;
import com.shawn.finance.fsmdemo.model.po.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by shawn on 16/1/21.
 */
@Service
public class ProductService {
    @Autowired
    private static ProductMapper productMapper;

//    private ProductService(){};

    public Product getProduct(Long id){
        return productMapper.getById(id);
    }
}
