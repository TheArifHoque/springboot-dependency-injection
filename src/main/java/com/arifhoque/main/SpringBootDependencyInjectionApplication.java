package com.arifhoque.main;

import com.arifhoque.main.config.BeanConfig;
import com.arifhoque.main.model.Programmer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({BeanConfig.class}) //Import is used to connect the BeanConfig class
public class SpringBootDependencyInjectionApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringBootDependencyInjectionApplication.class, args);

        Programmer p = context.getBean(Programmer.class);
        p.printDetails();
    }
}