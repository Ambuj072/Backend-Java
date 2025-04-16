package org.example.coreXml;

public class Car {
    private String name;
    Engine engine;

    public Car() {
    }

    public Car(String name, Engine engine) {
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

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void start(){
        System.out.println(name+" Starting");
        engine.start();

    }
}
