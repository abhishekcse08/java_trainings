package com.jlab.java.streamtraining;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SalaryCheker {
    public static void main(String[] args) {
        List<Employee> empList = DB.getEmployee();

        //List<Employee> collect = empList.stream().filter(e -> e.getSalary() > 500000).collect(Collectors.toList());
        //System.out.println(collect);
        //Collections.sort(empList,((o1, o2) -> (int) (o2.getSalary()-o1.getSalary())));

        empList.stream().sorted(Comparator.comparing(Employee::getDept)).forEach(System.out::println);
    }
}
