package com.shawn.finance.fsmdemo.fsm;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.statemachine.StateContext;
import org.springframework.statemachine.action.Action;
import org.springframework.statemachine.config.EnableStateMachine;
import org.springframework.statemachine.config.EnableStateMachineFactory;
import org.springframework.statemachine.config.EnumStateMachineConfigurerAdapter;

//import com.shawn.finance.fsmdemo.fsm;
//import com.shawn.finance.fsmdemo.fsm;
import org.springframework.statemachine.config.builders.StateMachineConfigurationConfig;
import org.springframework.statemachine.config.builders.StateMachineConfigurationConfigurer;
import org.springframework.statemachine.config.builders.StateMachineStateConfigurer;
import org.springframework.statemachine.config.builders.StateMachineTransitionConfigurer;
import org.springframework.statemachine.listener.StateMachineListener;
import org.springframework.statemachine.listener.StateMachineListenerAdapter;
import org.springframework.statemachine.state.State;

import java.util.EnumSet;

/**
 * Created by shawn on 15/12/25.
 */

@Configuration
@EnableStateMachine
public class UserStateMachineConfig extends EnumStateMachineConfigurerAdapter<States, Events> {
    private static Logger logger = LoggerFactory.getLogger(UserStateMachineConfig.class);

    @Override
    public void configure(StateMachineConfigurationConfigurer<States, Events> config) throws Exception{
        config
                .withConfiguration()
                    .autoStartup(true)
                    .listener(listener());
    }

    @Override
    public void configure(StateMachineStateConfigurer<States, Events> stateConfigurer) throws Exception{
        stateConfigurer.withStates()
                .initial(States.STATE_INIT,null)
                .states(EnumSet.allOf(States.class));
    }

    @Override
    public void configure(StateMachineTransitionConfigurer<States, Events> transitionConfigurer) throws Exception{
        transitionConfigurer
                .withExternal()
                .source(States.STATE_INIT)
                .target(States.STATE_APPLYING)
                .event(Events.EVENT_APPLY)
                .action(doApply())
                .and()
                .withExternal()
                .source(States.STATE_APPLYING)
                .target(States.STATE_APPLIED)
                .event(Events.EVENT_APPLY_SUCCESS)
                .action(doApplySuccess())
                .and()
                .withExternal()
                .source(States.STATE_APPLYING)
                .target(States.STATE_INIT)
                .event(Events.EVENT_APPLY_FAIL)
                .action(doApplyFail())
                .and()
                .withExternal()
                .source(States.STATE_APPLIED)
                .target(States.STATE_ACTIVING)
                .event(Events.EVENT_ACTIVE)
                .action(doActive())
                .and()
                .withExternal()
                .source(States.STATE_ACTIVING)
                .target(States.STATE_NORMAL)
                .event(Events.EVENT_ACTIVE_SUCCESS)
                .action(doActiveSuccess())
                .and()
                .withExternal()
                .source(States.STATE_ACTIVING)
                .target(States.STATE_APPLIED)
                .event(Events.EVENT_ACTIVE_FAIL)
                .action(doActiveFail())
                .and()
                .withExternal()
                .source(States.STATE_NORMAL)
                .target(States.STATE_OVERDUED)
                .event(Events.EVENT_OVERDUED)
                .action(doOverDued());
    }



    @Bean
    public StateMachineListener<States, Events> listener(){
        return new StateMachineListenerAdapter<States, Events>(){
            @Override
            public void stateChanged(State<States, Events> from, State<States, Events> to){
                if (null == from){
                    logger.warn("FROM is NULL");
                    if (null != to){
                        logger.warn("TO:[{}]", to.getId());
                    }
                    return;
                }

                if (null == to){
                    if (null != from){
                        logger.warn("FROM:[{}]", from.getId());
                    }
                    logger.warn("TO is NULL");
                    return;
                }

                logger.debug("FROM state[{}] to [{}]", from.toString(), to.toString());
            }
        };
    }

    @Bean
    public Action<States, Events> doApply(){
        return new Action<States, Events>() {
            @Override
            public void execute(StateContext<States, Events> stateContext) {
                logger.debug("Event:[{}]", stateContext.getEvent().toString());
            }
        };
    }

    @Bean
    public Action<States, Events> doApplySuccess(){
        return new Action<States, Events>() {
            @Override
            public void execute(StateContext<States, Events> context) {
                logger.warn("Event:[{}]", context.getEvent().toString());
            }
        };
    }

    @Bean
    public Action<States, Events> doApplyFail(){
        return new Action<States, Events>() {
            @Override
            public void execute(StateContext<States, Events> context) {
                logger.warn("Event:[{}]", context.getEvent().toString());
            }
        };
    }

    @Bean
    public Action<States, Events> doActive(){
        return new Action<States, Events>() {
            @Override
            public void execute(StateContext<States, Events> context) {
                logger.warn("Event:[{}]", context.getEvent().toString());
            }
        };
    }

    @Bean
    public Action<States, Events> doActiveSuccess(){
        return new Action<States, Events>() {
            @Override
            public void execute(StateContext<States, Events> context) {
                logger.warn("Event:[{}]", context.getEvent().toString());
            }
        };
    }

    @Bean
    public Action<States, Events> doActiveFail(){
        return new Action<States, Events>() {
            @Override
            public void execute(StateContext<States, Events> context) {
                logger.warn("Event:[{}]", context.getEvent().toString());
            }
        };
    }

    @Bean
    public Action<States, Events> doOverDued(){
        return new Action<States, Events>() {
            @Override
            public void execute(StateContext<States, Events> context) {
                logger.warn("Event:[{}]", context.getEvent().toString());
            }
        };
    }

}
