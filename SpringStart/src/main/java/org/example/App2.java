package org.example;

import org.example.coreXml.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App2 {

    public static void main(String[] args) {

        ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");

        Car car=context.getBean("car", Car.class);

        car.start();

    }
}
