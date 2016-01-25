package com.shawn.finance.fsmdemo.fsm;

import java.util.HashMap;
import java.util.Map;

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

    private static Map<Long, States> map = new HashMap<Long, States>();

    static {
        for (States s : States.values()){
            map.put((long) s.getIdx(), s);
        }
    }

    States(final int idx){
        this.idx = idx;
    }

    public int getIdx(){
        return this.idx;
    }

    public static States valueOf(long idx){
        return map.get(idx);
    }
};

