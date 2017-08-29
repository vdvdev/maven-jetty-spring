package com.sport.javaconfig;

import com.sport.javaconfig.motivation.BasicMotivation;
import com.sport.javaconfig.motivation.Motivation;
import com.sport.javaconfig.staff.BaseballStaff;
import com.sport.javaconfig.staff.Staff;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
//@ComponentScan("com.sport.javaconfig")
public class StaffConfig {
    @Bean
    public Staff baseballStaff(){
        return new BaseballStaff(basicMotivationMotivation());
    }

    @Bean
    public Motivation basicMotivationMotivation(){
        return new BasicMotivation();
    }
}
