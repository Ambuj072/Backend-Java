package org.ambuj.javaAnnotation;

import org.ambuj.javaAnnotation.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        System.out.println( "Hello World!" );
        //Annotation based
        ApplicationContext context= new AnnotationConfigApplicationContext(BeanContainer.class);
        Car car=context.getBean("car", Car.class);
        car.Start();
    }
}
