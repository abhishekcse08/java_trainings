package com.jlab.java.core;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
*  Map-Reduce is functional programming model it serves 2 purpose
* Map -> Transforming Data
* Reduce -> Aggregating Data
* combine element of stream and produce one single value
* ex. [2,3,4,5,6] sum of number present in stream?
* Map - > transform stream object to stream of int
* Reduce -> combine stream of int and produce the sum result
*T reduce(T identity,BinaryOperator<T> accumulator)
* identity is initial value and accumulator is a operation
* Integer SumRes = Stream.of(2,3,4,5,5,7).reduce(0,(a,b)->a+b);
* 0 is initial value
* (a,b)->a+b is accumulator function
* */
public class MapAndReduce {
    public static void main(String[] args) {
       // sumReduce(Stream.of(1, 2, 4).collect(Collectors.toList()));

        double maxSal = MyDatabase.getAll().stream()
                .filter(e -> e.getDept().equals("IT"))
                .mapToDouble(e -> e.getSalary())
                .reduce(Double::max).getAsDouble();

        double average = MyDatabase.getAll().stream()
                .filter(e -> e.getDept().equals("IT"))
                .mapToDouble(e -> e.getSalary())
                .average().getAsDouble();


        System.out.println("Max Salary of Employee "+maxSal);
       System.out.println(" Average Salary of IT Employee "+ average);
    }


    public static void sumReduce(List<Integer> l) {
        int sum = l.stream().mapToInt(i -> i).sum();
        System.out.println("sum reduce " + sum);
        Integer reduce = l.stream().reduce(0, (a, b) -> a + b);
        System.out.println("reduce " + reduce);
        Integer max = l.stream().reduce(Integer::max).get();
        System.out.println("Max " + max);

    }



}

    class MyDatabase{

        public static List<Employee> getAll(){
            return Stream.of(new Employee("01","A",23.0,"IT")
                    ,new Employee("02","A",2345.09,"IT")
                    ,new Employee("03","B",23415.09,"HR"))
                    .collect(Collectors.toList());
        }
    }

class  Employee {

    String employeeId;
    String grade;
    Double salary;
    String dept;

    public Employee(String employeeId, String grade, Double salary, String dept) {
        this.employeeId = employeeId;
        this.grade = grade;
        this.salary = salary;
        this.dept = dept;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
}