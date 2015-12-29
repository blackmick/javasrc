package com.shawn.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jms.listener.DefaultMessageListenerContainer;

import javax.jms.ConnectionFactory;
import javax.jms.JMSException;
import java.util.Scanner;

/**
 * Created by shawn on 15/11/5.
 */

class AmqDemo {
    public static void main(String args[]){
        try {
            String mode = args[0];
            switch (mode.toLowerCase()) {
                case "sender":
                    startSend();
                    break;
                case "receiver":
                    startReceiver();
                    break;
                default:
                    throw new ParamException();
            }
        }
        catch (ParamException e){
            System.out.println("Invalid parameter");
            System.out.println(args[0] + " <sender|receiver> [message]");
        }
    }

    public static void startSend(){
//        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring-xml");
//        ConnectionFactory cf = (ConnectionFactory)ctx.getBean("connectionFactory");
        Sender sender = new Sender();
        Scanner scanner = new Scanner(System.in);
        String msg;
        do{
            msg = scanner.next();
            if (msg.toUpperCase().equals("EOF")){
                break;
            }
            String m = msg;
            sender.send(m);
            System.out.println("send success." + m);
        }while(scanner.hasNext());
        sender.stop();
    }

    public static void startReceiver(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring-config.xml");
        DefaultMessageListenerContainer defaultMessageListenerContainer =
                (DefaultMessageListenerContainer)ctx.getBean("defaultMessageListenerContainer");
        defaultMessageListenerContainer.start();
    }
}
