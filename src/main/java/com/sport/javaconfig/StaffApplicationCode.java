package com.sport.javaconfig;

import com.sport.javaconfig.staff.Staff;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StaffApplicationCode {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(StaffConfig.class);

        //        by default component
        Staff staff = context.getBean("baseballStaff", Staff.class);
        System.out.println(staff.showDescription());

        context.close();
    }
}
