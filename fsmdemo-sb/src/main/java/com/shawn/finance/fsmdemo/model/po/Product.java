package com.shawn.finance.fsmdemo.model.po;

import com.shawn.finance.fsmdemo.fsm.Events;
import com.shawn.finance.fsmdemo.fsm.States;

/**
 * Created by shawn on 16/1/19.
 */
public class Product {
    private Long id;
    private States state;
    private Events lastEvent;

    public void setId(Long id){
        this.id = id;
    }

    public Long getId(){
        return id;
    }

    public void setState(States s){
        this.state = s;
    }

    public States getState(){
        return this.state;
    }

    public void setLastEvent(Events ev){
        this.lastEvent = ev;
    }

    public Events getLastEvent(){
        return this.lastEvent;
    }
}
