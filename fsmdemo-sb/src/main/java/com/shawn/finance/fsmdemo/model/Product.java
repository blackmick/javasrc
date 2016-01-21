package com.shawn.finance.fsmdemo.model;

import com.shawn.finance.fsmdemo.dao.mapper.ProductMapper;
import com.shawn.finance.fsmdemo.fsm.Events;
import com.shawn.finance.fsmdemo.fsm.States;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.statemachine.StateMachine;
import org.springframework.statemachine.support.DefaultStateMachineContext;

/**
 * Created by shawn on 16/1/18.
 */
public class Product {
    private static StateMachine<States, Events> stateMachine;

    @Autowired
    private ProductMapper productDao;

    private com.shawn.finance.fsmdemo.model.po.Product product = null;

    private Product(){};

    public static Product getProduct(long id){
        Product product = new Product();
        product.load(id);
        return product;
    };

    public void setState(States state){
        stateMachine.getStateMachineAccessor().withRegion().resetStateMachine(new DefaultStateMachineContext<States, Events>(state, null,null,null));
    };

    public boolean sendEvent(Events event){
        stateMachine.start();
        return stateMachine.sendEvent(event);
    };

    public void load(Long id){
        product = productDao.getById(id);
    }

    @Override
    public String toString(){
        return this.product.toString();
    }
}
