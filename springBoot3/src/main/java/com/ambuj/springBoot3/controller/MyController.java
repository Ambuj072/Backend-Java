package com.ambuj.springBoot3.controller;

import com.ambuj.springBoot3.repos.DatabaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MyController {

    //interface
    final private DatabaseService databaseService;


    @Autowired
    public MyController(DatabaseService databaseService) {
        this.databaseService = databaseService;
    }

    public void useTable(){
        List<String> table=this.databaseService.getTable();
        System.out.println(table);
    }
}
