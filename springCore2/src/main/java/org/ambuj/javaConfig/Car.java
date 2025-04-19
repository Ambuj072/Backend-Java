package org.ambuj.javaConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Car {

    private  String name;
   // @Autowired
    private Engine engine;

    public Car() {
    }
    @Autowired
    public Car(@Qualifier("carBean") String name, Engine engine) {
        this.name = name;
        this.engine = engine;
    }

    public String getName() {
        return name;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setName(String name) {
        this.name = name;
    }

    //@Autowired
    public void setEngine(Engine engine) {
        this.engine = engine;
        System.out.println("setting engine using setter");
    }

    public void Start(){
        System.out.println(name+" Starting");
        engine.start();
    }
}
