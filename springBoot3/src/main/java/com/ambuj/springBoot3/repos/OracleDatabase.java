package com.ambuj.springBoot3.repos;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
/// @Primary we have maken it primary key
public class OracleDatabase implements DatabaseService{

    @Override
    public List<String> getTable() {
        return List.of("authenticaton","authuser");
    }
}
