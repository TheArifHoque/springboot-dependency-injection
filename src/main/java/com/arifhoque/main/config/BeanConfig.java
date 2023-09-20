package com.arifhoque.main.config;

import com.arifhoque.main.model.Computer;
import com.arifhoque.main.model.Programmer;
import com.arifhoque.main.model.Supplier;
import org.springframework.context.annotation.Bean;

/*
Bean class which controls the object creation.
In this case it'll first create supplier object and pass it to Computer method.
Computer method will take supplier object and create computer object and pass it to Programmer method.
Programmer method will take computer object and create programmer object
 */

/*
This is inversion of control method. Means we're giving the access of creating object to another class
which will automate the object creation process
 */
public class BeanConfig {
    /*
    Bean annotation is used to make sure the below methods are used as bean/object creation
    Bean automatically uses Singleton design pattern.
    But with Scope annotation we can change it to "prototype" design pattern as well "@Scope("prototype")"
     */
    @Bean
    public Programmer programmer(Computer computer){
        Programmer p = new Programmer();
        p.setName("Mr. X");
        p.setComputer(computer);
        return p;
    }
    @Bean
    public Computer computer(Supplier supplier){
        Computer c = new Computer();
        c.setBrand("HP");
        c.setModel("ProBook");
        c.setSupplier(supplier);
        return c;
    }
    @Bean
    public Supplier supplier(){
        Supplier s = new Supplier();
        s.setName("China Computers");
        s.setCountry("China");
        return s;
    }
}
