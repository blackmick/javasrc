package com.shawn.finance.fsmdemo.fsm;

import com.shawn.finance.fsmdemo.fsm.events.UserEvents;
import com.shawn.finance.fsmdemo.fsm.states.UserStates;
import org.springframework.statemachine.StateMachine;
import org.springframework.statemachine.support.StateMachineContextUtils;

/**
 * Created by shawn on 16/1/5.
 */
public class UserStateMachine {
    private StateMachine<UserStates, UserEvents> stateMachine;

    public UserStateMachine(UserStates state){
    }

    public boolean sendEvent(UserEvents event){
        return stateMachine.sendEvent(event);
    }
}
