package com.ambuj.springBoot3;

import com.ambuj.springBoot3.controller.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class SpringBoot3Application {

	public static void main(String[] args) {


		 ConfigurableApplicationContext context= SpringApplication.run(SpringBoot3Application.class, args);
		 MyController bean=context.getBean(MyController.class);
		 bean.useTable();
	}

}
