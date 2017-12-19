package com.sport.javaconfig;

import com.sport.javaconfig.motivation.BasicMotivation;
import com.sport.javaconfig.motivation.Motivation;
import com.sport.javaconfig.staff.BaseballStaff;
import com.sport.javaconfig.staff.Staff;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Configuration
@PropertySource("classpath:workPosition.properties")
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
