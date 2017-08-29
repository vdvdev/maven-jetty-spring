package com.sport.xmlconfig;

import com.sport.xmlconfig.coaches.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CoachingApplicationXML {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("coachApplicationContext.xml");

        Coach coach = context.getBean("priorCoach", Coach.class);
        System.out.println(coach.getDescription());

        Coach coach3 = context.getBean("thirdCoach", Coach.class);
        System.out.println(coach3.getDescription());

        Coach coach4 = context.getBean("4thCoach", Coach.class);
        System.out.println(coach4.getDescription());


        context.close();
    }
}
