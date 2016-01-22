package com.shawn.finance.fsmdemo.fsm.config;

import com.shawn.finance.fsmdemo.fsm.events.UserEvents;
import com.shawn.finance.fsmdemo.fsm.states.UserStates;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
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
@EnableStateMachine
//@EnableStateMachineFactory
public class UserStateMachineConfig extends EnumStateMachineConfigurerAdapter<UserStates, UserEvents> {
    private static Logger logger = LoggerFactory.getLogger(UserStateMachineConfig.class);

    public void configure(StateMachineStateConfigurer<UserStates, UserEvents> config) throws Exception {
        config.withStates()
                .initial(UserStates.STATE_INIT,null)
                .states(EnumSet.allOf(UserStates.class));
    }

    public void configure(StateMachineConfigurationConfigurer<UserStates, UserEvents> config) throws Exception {
        config.withConfiguration()
//                .autoStartup(true)
                .listener(listener());
    }

    public void configure(StateMachineTransitionConfigurer<UserStates, UserEvents> transitionConfigurer) throws Exception {
        transitionConfigurer
                .withExternal()
                .source(UserStates.STATE_INIT)
                .target(UserStates.STATE_APPLYING)
                .event(UserEvents.EVENT_APPLY)
                .action(doApply())
                .and()
                .withExternal()
                .source(UserStates.STATE_APPLYING)
                .target(UserStates.STATE_APPLIED)
                .event(UserEvents.EVENT_APPLY_SUCCESS)
                .action(doApplySuccess())
                .and()
                .withExternal()
                .source(UserStates.STATE_APPLYING)
                .target(UserStates.STATE_INIT)
                .event(UserEvents.EVENT_APPLY_FAIL)
                .action(doApplyFail())
                .and()
                .withExternal()
                .source(UserStates.STATE_APPLIED)
                .target(UserStates.STATE_ACTIVING)
                .event(UserEvents.EVENT_ACTIVE)
                .action(doActive())
                .and()
                .withExternal()
                .source(UserStates.STATE_ACTIVING)
                .target(UserStates.STATE_NORMAL)
                .event(UserEvents.EVENT_ACTIVE_SUCCESS)
                .action(doActiveSuccess())
                .and()
                .withExternal()
                .source(UserStates.STATE_ACTIVING)
                .target(UserStates.STATE_APPLIED)
                .event(UserEvents.EVENT_ACTIVE_FAIL)
                .action(doActiveFail())
                .and()
                .withExternal()
                .source(UserStates.STATE_NORMAL)
                .target(UserStates.STATE_OVERDUED)
                .event(UserEvents.EVENT_OVERDUED)
                .action(doOverDued());
    }

    public StateMachineListener<UserStates, UserEvents> listener() {
        return new StateMachineListenerAdapter<UserStates, UserEvents>() {
            public void stateChanged(State<UserStates, UserEvents> from, State<UserStates, UserEvents> to) {
                if (null == from) {
                    if (null != to) {
                        logger.warn("FSM:FROM NULL TO STATE [{}]", to.getId());
                        return;
                    }
                    logger.warn("FSM:FROM NULL TO NULL");
                    return;
                }

                if (null == to) {
                    logger.warn("FSM: FROM [{}] TO NULL", from.getId());
                    return;
                }

                logger.warn("FSM: FROM [{}] TO [{}]", from.getId(), to.getId());
            }
        };
    }

    @Bean
    public Action<UserStates, UserEvents> doApply(){
        return new Action<UserStates, UserEvents>() {
            @Override
            public void execute(StateContext<UserStates, UserEvents> stateContext) {
                logger.debug("Event:[{}]", stateContext.getEvent().toString());
            }
        };
    }

    @Bean
    public Action<UserStates, UserEvents> doApplySuccess(){
        return new Action<UserStates, UserEvents>() {
            @Override
            public void execute(StateContext<UserStates, UserEvents> context) {
                logger.warn("Event:[{}]", context.getEvent().toString());
            }
        };
    }

    @Bean
    public Action<UserStates, UserEvents> doApplyFail(){
        return new Action<UserStates, UserEvents>() {
            @Override
            public void execute(StateContext<UserStates, UserEvents> context) {
                logger.warn("Event:[{}]", context.getEvent().toString());
            }
        };
    }

    @Bean
    public Action<UserStates, UserEvents> doActive(){
        return new Action<UserStates, UserEvents>() {
            @Override
            public void execute(StateContext<UserStates, UserEvents> context) {
                logger.warn("Event:[{}]", context.getEvent().toString());
            }
        };
    }

    @Bean
    public Action<UserStates, UserEvents> doActiveSuccess(){
        return new Action<UserStates, UserEvents>() {
            @Override
            public void execute(StateContext<UserStates, UserEvents> context) {
                logger.warn("Event:[{}]", context.getEvent().toString());
            }
        };
    }

    @Bean
    public Action<UserStates, UserEvents> doActiveFail(){
        return new Action<UserStates, UserEvents>() {
            @Override
            public void execute(StateContext<UserStates, UserEvents> context) {
                logger.warn("Event:[{}]", context.getEvent().toString());
            }
        };
    }

    @Bean
    public Action<UserStates, UserEvents> doOverDued(){
        return new Action<UserStates, UserEvents>() {
            @Override
            public void execute(StateContext<UserStates, UserEvents> context) {
                logger.warn("Event:[{}]", context.getEvent().toString());
            }
        };
    }
}
