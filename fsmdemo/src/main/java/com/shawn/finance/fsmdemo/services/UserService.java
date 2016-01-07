package com.shawn.finance.fsmdemo.services;

import com.shawn.finance.fsmdemo.fsm.events.UserEvents;
import com.shawn.finance.fsmdemo.fsm.states.UserStates;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.statemachine.StateMachine;
import org.springframework.statemachine.config.StateMachineBuilder;
import org.springframework.statemachine.config.StateMachineFactory;

/**
 * Created by shawn on 16/1/5.
 */
public class UserService {
    private StateMachine<UserStates,UserEvents> stateMachine;

    @Autowired
    private StateMachineFactory<UserStates, UserEvents> stateMachineFactory;

    public UserService(){
        stateMachine = stateMachineFactory.getStateMachine();

    }
    public void doApply(){
        stateMachine.sendEvent(UserEvents.EVENT_APPLY);
    }
}
