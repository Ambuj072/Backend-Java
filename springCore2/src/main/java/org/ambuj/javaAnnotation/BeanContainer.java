package org.ambuj.javaAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.ambuj.javaAnnotation")
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
