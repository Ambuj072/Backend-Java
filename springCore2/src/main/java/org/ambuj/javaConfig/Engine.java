package org.ambuj.javaConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Engine {

    private  String engineName;


    public Engine() {
    }
    @Autowired
    public Engine(@Qualifier("engineBean") String engineName) {
        this.engineName = engineName;
    }

    public String getEngineName() {
        return engineName;
    }

    public void setEngineName(String engineName) {
        this.engineName = engineName;
    }

    public  void start(){
        System.out.println(engineName+" Engine starting");
        System.out.println("Engine Started");
    }
}


