package com.jlab.java.comprator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyComprable {
    public static void main(String[] args) {
        Student s1= new Student(1,"TEST",12);
        Student s2= new Student(10,"TEST1",34);
        Student s3= new Student(0,"TEST2",01);
        Student s4= new Student(1100,"TEST3",10);

        List<Student> ls = new ArrayList<>();
        ls.add(s1);
        ls.add(s2);
        ls.add(s3);
        ls.add(s4);

      /*  Collections.sort(ls);
        for(Student s:ls){
            System.out.println(s.id);
        }*/
        //-------------
     Collections.sort(ls,new StudentSort());
        for(Student s:ls){
            System.out.println(s.id);
        }
    }
}


class Student implements Comparable<Student>{

    int id;
    String name;
    int age;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Student o) {
        if(o.id==this.id) return 0;
        if(o.id>this.id) return 1;
        if(o.id<this.id) return -1;
        return 0;
    }
}

class StudentSort implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {

        return o1.id-o2.id;
    }
}