package org.example;

import org.example.core.Car;
import org.example.core.Engine;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        System.out.println("Hello World!");
        //here Engine will be same for every car
        //Car tataSafari=new Car("tataSafari");

        //Now i can define different engine for car
        Car tataSafari=new Car("tataSafari",new Engine("ford"));
        tataSafari.start();
        Car tataSafari2=new Car("tataSafari",new Engine("tata"));
        tataSafari2.start();
    }
}
