package com.shawn.finance.fsmdemo.dao;

import com.shawn.finance.fsmdemo.dao.mapper.ProductMapper;
import com.shawn.finance.fsmdemo.fsm.Events;
import com.shawn.finance.fsmdemo.fsm.States;
import com.shawn.finance.fsmdemo.model.po.Product;

/**
 * Created by shawn on 16/1/18.
 */
public class ProductDao implements ProductMapper{
    private long id;
    private States state;
    private Events lastEvent;

    public void addProduct(){

    }

    public Product getById(Long id){

    }
}
