package com.shawn.finance.fsmdemo.model.po;

import com.shawn.finance.fsmdemo.fsm.Events;
import com.shawn.finance.fsmdemo.fsm.States;

/**
 * Created by shawn on 16/1/19.
 */
public class Product {
    private Long id;
    private States state;
    private Events event;

    void setId(Long id){
        this.id = id;
    }

    Long getId(){
        return id;
    }

    void setState(States s){
        this.state = s;
    }

    States getState(){
        return this.state;
    }

    void setEvent(Events ev){
        this.event = ev;
    }

    Events getEvent(){
        return this.event;
    }
}
