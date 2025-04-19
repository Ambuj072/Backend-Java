package org.ambuj.javaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanContainer {
    @Bean(name="carBean")
    public String carName(){
        return  "Tata";
    }
    @Bean(name="engineBean")
    public String engineBean(){
        return  "tataSafari";
    }

}
