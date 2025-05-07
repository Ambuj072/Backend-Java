package com.ambuj.springBoot3;

import com.ambuj.springBoot3.controller.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringBoot3Application {

	public static void main(String[] args) {


		 ApplicationContext context= SpringApplication.run(SpringBoot3Application.class, args);
		 MyController bean=context.getBean(MyController.class);
		 bean.useTable();
	}

}
