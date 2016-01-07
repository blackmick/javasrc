package com.shawn.finance.fsmdemo.fsm.config;

import com.shawn.finance.fsmdemo.fsm.events.UserEvents;
import com.shawn.finance.fsmdemo.fsm.states.UserStates;
import org.springframework.context.annotation.Configuration;
import org.springframework.statemachine.StateContext;
import org.springframework.statemachine.action.Action;
import org.springframework.statemachine.config.EnableStateMachine;
import org.springframework.statemachine.config.EnableStateMachineFactory;
import org.springframework.statemachine.config.EnumStateMachineConfigurerAdapter;
import org.springframework.statemachine.config.builders.StateMachineConfigurationConfigurer;
import org.springframework.statemachine.config.builders.StateMachineStateConfigurer;
import org.springframework.statemachine.config.builders.StateMachineTransitionConfigurer;
import org.springframework.statemachine.listener.StateMachineListener;
import org.springframework.statemachine.listener.StateMachineListenerAdapter;
import org.springframework.statemachine.state.State;

import java.util.EnumSet;

/**
 * Created by shawn on 15/12/29.
 */
@Configuration
@EnableStateMachineFactory
public class UserStateMachineConfig extends EnumStateMachineConfigurerAdapter<UserStates, UserEvents>{
//    private static Logger logger = LoggerFactory

    public void configure(StateMachineStateConfigurer<UserStates, UserEvents> config) throws Exception{
        config.withStates()
                .initial(UserStates.STATE_INIT)
                .end(UserStates.STATE_APPLYING)
                .states(EnumSet.allOf(UserStates.class));
    }

    public void configure(StateMachineConfigurationConfigurer<UserStates, UserEvents> config) throws Exception{
        config.withConfiguration()
                .autoStartup(true)
                .listener(listener());
    }

    public void configure(StateMachineTransitionConfigurer<UserStates, UserEvents> transitionConfigurer) throws Exception{
        transitionConfigurer.withExternal()
                .source(UserStates.STATE_INIT)
                .target(UserStates.STATE_APPLYING)
                .action(doApply());
    }

    public Action<UserStates, UserEvents> doApply(){
        return new Action<UserStates, UserEvents>(){
            public void execute(StateContext<UserStates, UserEvents> context){
                System.out.println("In action doApply");
            }
        };
    }
    public StateMachineListener<UserStates, UserEvents> listener(){
        return new StateMachineListenerAdapter<UserStates, UserEvents>(){
            public void stateChanged(State<UserStates, UserEvents> from, State<UserStates, UserEvents> to){

            }
        };
    }
}
