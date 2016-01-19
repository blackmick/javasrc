package com.shawn.finance.fsmdemo.model;

import com.shawn.finance.fsmdemo.dao.ProductDao;
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
    private static ProductDao productDao;

    private Product(){};

    public static com.shawn.finance.fsmdemo.model.po.Product getProduct(long id){
        return productDao.getById(id);
    };

    public void setState(States state){
        stateMachine.getStateMachineAccessor().withRegion().resetStateMachine(new DefaultStateMachineContext<States, Events>(state, null,null,null));
    };

    public boolean sendEvent(Events event){
        stateMachine.start();
        return stateMachine.sendEvent(event);
    };
}
