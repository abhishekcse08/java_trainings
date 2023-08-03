package com.jlab.java.streamtraining;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapOps {

    public static void main(String[] args) {
        List<Student> ll = DBLoader.getAllStudent();
        List<List<Integer>> collect = ll.stream().map(e -> e.getPhoneNumber())
                .collect(Collectors.toList());

        System.out.println(collect);

        System.out.println("-------- BELOW IS FLAT MAP-----");

        List<Integer> collect1 = ll.stream().flatMap(e ->
                        e.getPhoneNumber().stream().filter(t->t%2==0))
                .collect(Collectors.toList());

        System.out.println(collect1);


    }
}


class DBLoader{

    public static List<Student> getAllStudent(){


     return Stream.of(
                new Student(101,"CTR", Arrays.asList(1213,34556)),
                new Student(102,"YSR", Arrays.asList(1033,34996)),
                new Student(1045,"BHF", Arrays.asList(1003,0001)),
                new Student(1000,"YUTR", Arrays.asList(18883,2000))

        ).collect(Collectors.toList());

    }
}

class Student{

    int id;
    String name;
    List<Integer> phoneNumber;

    public Student(int id, String name, List<Integer> phoneNumber) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public Student() {
    }


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Integer> getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(List<Integer> phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}