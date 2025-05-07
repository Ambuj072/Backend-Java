package com.ambuj.springBoot3.repos;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MysqlDatabase implements DatabaseService{


    @Override
    public List<String> getTable() {
        return List.of("ram","shyam","radha");
    }
}
