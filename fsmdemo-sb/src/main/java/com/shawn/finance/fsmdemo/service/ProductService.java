package com.shawn.finance.fsmdemo.service;

import com.shawn.finance.fsmdemo.dao.mapper.ProductMapper;
import com.shawn.finance.fsmdemo.fsm.Events;
import com.shawn.finance.fsmdemo.fsm.States;
import com.shawn.finance.fsmdemo.fsm.persist.PersistStateMachineHandler;
import com.shawn.finance.fsmdemo.model.po.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.Message;
import org.springframework.statemachine.StateMachine;
import org.springframework.statemachine.state.State;
import org.springframework.statemachine.support.DefaultStateMachineContext;
import org.springframework.statemachine.transition.Transition;
import org.springframework.stereotype.Service;

/**
 * Created by shawn on 16/1/21.
 */
@Service
public class ProductService {
    @Autowired
    private ProductMapper productMapper;

    private Product product;

    @Autowired
    private StateMachine<States, Events> stateMachine;

    private PersistStateMachineHandler<States, Events> persistStateMachineHandler;


    public Product getProduct(Long id){
        this.product = productMapper.getById(id);
        this.persistStateMachineHandler = new PersistStateMachineHandler<States, Events>(stateMachine);
        return this.product;
    }

    public void setState(States s){
//        product.setState(s);
        stateMachine.getStateMachineAccessor().withRegion().resetStateMachine(new DefaultStateMachineContext<States, Events>(s, null, null, null));
    }

    public boolean sendEvent(Events e){
        stateMachine.start();
        return stateMachine.sendEvent(e);
    }

    private class ProductPersistStateChangeListener implements PersistStateMachineHandler.PersistStateChangeListener<States, Events> {
        @Override
        public void onPersist(States state, Events event, Transition<States, Events> transition, StateMachine<States, Events>stateMachine){

        }
    }
}
