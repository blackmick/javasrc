package com.shawn.finance.fsmdemo.controller;

import com.shawn.finance.fsmdemo.fsm.Events;
import com.shawn.finance.fsmdemo.fsm.States;
import com.shawn.finance.fsmdemo.model.po.Product;
import com.shawn.finance.fsmdemo.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.statemachine.StateMachine;
import org.springframework.statemachine.support.DefaultStateMachineContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by shawn on 15/12/24.
 */

@RestController
public class TestController {
    private static Logger logger = LoggerFactory.getLogger(TestController.class);

    @Autowired
    private StateMachine<States, Events> stateMachine;

    @RequestMapping("/test")
    public String test(
            @RequestParam("source") String source,
            @RequestParam("event") String event,
            @RequestParam("id") Long id
    ){
        States ss = States.valueOf(source.toUpperCase());
        Events e = Events.valueOf(event.toUpperCase());


        ProductService productService = new ProductService();
        Product product = productService.getProduct(id);

        logger.warn("get product[{}]:[{}]", id, product.toString());

        if (ss == null || e == null){
            return "Wrong source or event";
        }

        stateMachine.getStateMachineAccessor().withRegion().resetStateMachine(new DefaultStateMachineContext<States, Events>(ss, null, null, null));

        stateMachine.start();
        stateMachine.sendEvent(e);
        return stateMachine.getState().toString();
    }
}
