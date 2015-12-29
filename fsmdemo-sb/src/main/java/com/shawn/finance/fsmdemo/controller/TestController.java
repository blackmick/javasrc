package com.shawn.finance.fsmdemo.controller;

import com.shawn.finance.fsmdemo.fsm.Events;
import com.shawn.finance.fsmdemo.fsm.States;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.statemachine.StateMachine;
import org.springframework.statemachine.config.StateMachineFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by shawn on 15/12/24.
 */

@RestController
@RequestMapping("/test")
public class TestController {
//    @Autowired
//    StateMachineFactory<States, Events> stateMachineFactory;

    @Autowired
    private StateMachine<States, Events> stateMachine;

//    public TestController(){
//        if (stateMachineFactory == null){
//            System.out.println("stateMachineFactory is null");
//            return;
//        }
//        stateMachine = stateMachineFactory.getStateMachine();
//        stateMachine.start();
//    }

    @RequestMapping("/")
    public String test(){
        stateMachine.sendEvent(Events.EVENT_APPLY);
        return "Shit web";
    }
}
