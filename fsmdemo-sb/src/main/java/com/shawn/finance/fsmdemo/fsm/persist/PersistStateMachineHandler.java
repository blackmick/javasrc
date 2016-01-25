package com.shawn.finance.fsmdemo.fsm.persist;

import org.springframework.messaging.Message;
import org.springframework.statemachine.StateMachine;
import org.springframework.statemachine.access.StateMachineAccess;
import org.springframework.statemachine.access.StateMachineFunction;
import org.springframework.statemachine.listener.AbstractCompositeListener;
import org.springframework.statemachine.state.State;
import org.springframework.statemachine.support.DefaultStateMachineContext;
import org.springframework.statemachine.support.LifecycleObjectSupport;
import org.springframework.statemachine.support.StateMachineInterceptorAdapter;
import org.springframework.statemachine.transition.Transition;

import java.util.Iterator;
import java.util.List;

/**
 * Created by shawn on 16/1/25.
 */
public class PersistStateMachineHandler<S, E> extends LifecycleObjectSupport{
    private final StateMachine<S, E> stateMachine;
    private final PersistingStateChangeInterceptor interceptor = new PersistingStateChangeInterceptor();
    private final CompositePersistStateChangeListener listeners = new CompositePersistStateChangeListener();

    public PersistStateMachineHandler(StateMachine<S, E> stateMachine){
        this.stateMachine = stateMachine;
    }

    @Override
    protected void onInit() throws Exception{
        stateMachine.getStateMachineAccessor().doWithAllRegions(new StateMachineFunction<StateMachineAccess<S, E>>() {
            @Override
            public void apply(StateMachineAccess<S, E> seStateMachineAccess) {
                seStateMachineAccess.addStateMachineInterceptor(interceptor);
            }
        });
    }

    public void addPersistStateChangeListener(PersistStateChangeListener<S, E> listener){
        this.listeners.register(listener);
    }

    public boolean handleEventWithState(E event, S state){
        stateMachine.stop();
        List<StateMachineAccess<S, E>> withAllRegions = stateMachine.getStateMachineAccessor().withAllRegions();
        for (StateMachineAccess<S, E> a : withAllRegions){
            a.resetStateMachine(new DefaultStateMachineContext<S, E>(state, null ,null, null));
        }
        stateMachine.start();
        return stateMachine.sendEvent(event);
    }

    public interface PersistStateChangeListener<S, E>{
        void onPersist(S state, E event, Transition<S, E>transition, StateMachine<S, E>stateMachine);
    }

    private class PersistingStateChangeInterceptor extends StateMachineInterceptorAdapter<S,E>{
        @Override
        public void preStateChange(State<S, E> state, Message<E> message, Transition<S, E> transition, StateMachine<S, E> stateMachine) {
            listeners.onPersist(state.getId(), message.getPayload(), transition, stateMachine);
        }

    };

    private class CompositePersistStateChangeListener extends AbstractCompositeListener<PersistStateChangeListener<S, E>> implements PersistStateChangeListener<S, E>{
        @Override
        public void onPersist(S state, E event, Transition<S, E>transition, StateMachine<S, E>stateMachine){
            for(Iterator<PersistStateChangeListener<S, E>> iterator = getListeners().reverse(); iterator.hasNext();){
                PersistStateChangeListener<S, E> listener = iterator.next();
                listener.onPersist(state, event, transition, stateMachine);
            }
        }
    }
}
