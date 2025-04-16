package org.example.coreXml;

public class Engine {
    private  String engineName;

    public Engine() {
    }

    public String getEngineName() {
        return engineName;
    }

    public void setEngineName(String engineName) {
        this.engineName = engineName;
    }

    public Engine(String engineName) {
        this.engineName = engineName;
    }
    public void start(){
        System.out.println(engineName+" Starting");
        System.out.println("Engine Started");
    }


}
