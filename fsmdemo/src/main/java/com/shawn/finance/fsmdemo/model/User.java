package com.shawn.finance.fsmdemo.model;

import com.shawn.finance.fsmdemo.fsm.events.UserEvents;
import com.shawn.finance.fsmdemo.fsm.states.UserStates;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.statemachine.StateMachine;

/**
 * Created by shawn on 16/1/5.
 */
public class User {
    @Autowired
    private StateMachine<UserStates, UserEvents> stateMachine;

    public StateMachine<UserStates, UserEvents> getStateMachine(){
        return stateMachine;
    }
}
