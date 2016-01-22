package com.shawn.finance.fsmdemo.controller;

import com.shawn.finance.fsmdemo.fsm.events.UserEvents;
import com.shawn.finance.fsmdemo.fsm.states.UserStates;
import com.shawn.finance.fsmdemo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RestController;

/**
 * Created by shawn on 15/12/29.
 */
@Controller
@RequestMapping("test")
public class TestController {
    @Autowired
    private UserService userService;

    @RequestMapping(method = {RequestMethod.GET ,RequestMethod.POST})
    @ResponseBody
    public String test(@RequestParam("state") String state, @RequestParam("event") String ev, @RequestParam("id") Long id){
        UserStates sourceState = UserStates.valueOf(state.toUpperCase());
        UserEvents event = UserEvents.valueOf(ev.toUpperCase());

        if (sourceState == null || event == null){
            return "Wrong state and Event";
        }

        userService.setState(sourceState);
        userService.sendEvent(event);
//        us.doApply();
        return "Test";
    }
}
