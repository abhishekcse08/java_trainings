package com.jlab.java.streamtraining;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapOperations {

    public static void main(String[] args) {
        List<Employee> empList = DB.getEmployee();
        Map<String,String> t = new HashMap<>();
        t.put("One","ONE");
        List<String> collect = t.entrySet().stream().map(e -> e.getKey()).filter(e->e.startsWith("O")).collect(Collectors.toList());

                //.collect(Collectors.toList());
        System.out.println(collect);

    }


}


