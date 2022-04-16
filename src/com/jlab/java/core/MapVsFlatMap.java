package com.jlab.java.core;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
*  Map is used to transformation of data from one stream to another stream
* e.g. [a,b,c,d] => [A,B,C,D]
* Flat Map is used to transformation + flattening the data it takes input stream of stream and return stream
* e.g. [[a,b],[c,d]] => after flatmap operation => [A,B,C,D]
*
*
* */
public class MapVsFlatMap {

    public static void main(String[] args) {
        // converting List<Customer > to List<String>
        // Map function will apply for one to one mapping like one customer have one email
        List<Customer> customers = CustomDataBase.getAll();
        List<String> email = customers.stream().map(customer -> customer.getEmail()).collect(Collectors.toList());
        System.out.println("<- MAP DATA ->");
        System.out.println(email);
        //one to many mapping
        List<String> phoneNumber = customers.stream().flatMap(customer -> customer.getPhoneNumbers().stream()).collect(Collectors.toList());
        System.out.println("<- Flat Map Data ->");
        System.out.println(phoneNumber);
    }
}

class CustomDataBase{
    public static List<Customer> getAll(){
        return Stream.of(
                new Customer("01","Kelly","kelly01@gmail.com", Arrays.asList("001","001-002")),
                new Customer("02","paul","paul01@gmail.com", Arrays.asList("002","002890")),
                new Customer("03","willison","willison03@gmail.com", Arrays.asList("003","003098")),
                new Customer("04","sammy","sammy04@gmail.com", Arrays.asList("004","00409003"))
        ).collect(Collectors.toList());
    }
}
class Customer{

    String id;
    String name;
    String email;
    List<String> phoneNumbers;

    public Customer(String id, String name, String email, List<String> phoneNumbers) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumbers = phoneNumbers;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumbers=" + phoneNumbers +
                '}';
    }
}