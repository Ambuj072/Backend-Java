package org.example.core;

public class Car {
    private String name;
    Engine engine;

    /*
    public Car(String name){
        this.name=name;

    }
    */


    public Car(String name, Engine engine) {
        this.name = name;
        this.engine = engine;
    }

    private  Engine engine1=new Engine("ford");


    public  void  start(){
        System.out.println(name+" Starting");
        engine.start();
    }
}
