package com.shawn.finance.fsmdemo.fsm;

import org.springframework.statemachine.StateMachine;
import org.springframework.statemachine.listener.StateMachineListenerAdapter;

/**
 * Created by shawn on 16/1/19.
 */
public class PersistListener extends StateMachineListenerAdapter<States, Events> {
    @Override
    public void stateMachineStarted(StateMachine<States, Events> stateMachine) {
    }
}
