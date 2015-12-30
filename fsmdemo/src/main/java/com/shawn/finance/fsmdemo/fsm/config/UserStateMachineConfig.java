package com.shawn.finance.fsmdemo.fsm.config;

import com.shawn.finance.fsmdemo.fsm.events.UserEvents;
import com.shawn.finance.fsmdemo.fsm.states.UserStates;
import org.springframework.context.annotation.Configuration;
import org.springframework.statemachine.config.EnableStateMachine;
import org.springframework.statemachine.config.EnumStateMachineConfigurerAdapter;

/**
 * Created by shawn on 15/12/29.
 */
@Configuration
@EnableStateMachine
public class UserStateMachineConfig extends EnumStateMachineConfigurerAdapter<UserStates, UserEvents> {
}
