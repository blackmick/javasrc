package com.shawn.finance.fsmdemo.fsm;

/**
 * Created by shawn on 15/12/25.
 */

public enum States{
    STATE_INIT (0),
    STATE_APPLYING (1),
    STATE_APPLIED (2),
    STATE_ACTIVING (3),
    STATE_NORMAL (4),
    STATE_OVERDUED (5);

    private int idx;

    States(int idx){
        this.idx = idx;
    }

    public int getIdx(){
        return this.idx;
    }
};

