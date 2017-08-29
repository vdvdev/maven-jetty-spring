package com.sport.annotationsconfig;

import com.sport.annotationsconfig.players.Player;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PlayerApplicationAnnotations {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("playerApplicationContext.xml");

        //        by default component
        Player player = context.getBean("footballPlayer", Player.class);
        System.out.println(player.getDescription());

        context.close();
    }
}
