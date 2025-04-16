package org.example.core;

public class Engine {
    private  String companyName;

    public Engine() {
    }

    public Engine(String companyName) {
        this.companyName = companyName;
    }

    public  void start(){
        System.out.println(companyName+" Engine starting");
        System.out.println("Engine started");
    }
}
