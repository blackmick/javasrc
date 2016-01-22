package com.shawn.finance.fsmdemo.services;

import com.shawn.finance.fsmdemo.fsm.events.UserEvents;
import com.shawn.finance.fsmdemo.fsm.states.UserStates;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.statemachine.StateMachine;
import org.springframework.statemachine.config.EnableStateMachine;
import org.springframework.statemachine.config.StateMachineBuilder;
import org.springframework.statemachine.config.StateMachineFactory;
import org.springframework.statemachine.support.DefaultStateMachineContext;
import org.springframework.stereotype.Service;

/**
 * Created by shawn on 16/1/5.
 */

@Service
public class UserService {
    @Autowired
    private StateMachine<UserStates, UserEvents> stateMachine;

//    @Autowired
//    private StateMachineFactory<UserStates, UserEvents> stateMachineFactory;

//    public UserService(){
//        stateMachine = stateMachineFactory.getStateMachine();
//
//    }
    public void setState(UserStates state){

        stateMachine.getStateMachineAccessor().
                withRegion().
                resetStateMachine(new DefaultStateMachineContext<UserStates, UserEvents>(state, null, null, null));
    }

    public boolean sendEvent(UserEvents ev){
        stateMachine.start();
        return stateMachine.sendEvent(ev);
    }

    public void doApply(){
        stateMachine.start();
        stateMachine.sendEvent(UserEvents.EVENT_APPLY);
    }
}
