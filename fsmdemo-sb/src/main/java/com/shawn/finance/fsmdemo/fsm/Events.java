package com.shawn.finance.fsmdemo.fsm;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by shawn on 15/12/25.
 */

public enum Events{
    EVENT_INIT(0),
    EVENT_APPLY(1),
    EVENT_APPLY_SUCCESS(2),
    EVENT_APPLY_FAIL(3),
    EVENT_ACTIVE(4),
    EVENT_ACTIVE_SUCCESS(5),
    EVENT_ACTIVE_FAIL(6),
    EVENT_OVERDUED(7);

    private int idx;
    private static Map<Long, Events> map = new HashMap<Long, Events>();

    static{
        for (Events e: Events.values()){
            map.put((long) e.getIdx(), e);
        }
    }

    Events(final int idx){
        this.idx = idx;
    }

    public int getIdx(){
        return this.idx;
    }

    public static Events valueOf(long idx){
        return map.get(idx);
    }
};

