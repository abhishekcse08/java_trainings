package com.jlab.java.streamtraining;

import java.util.ArrayList;
import java.util.List;

public class DB {

    public static List<Employee> getEmployee(){
        List<Employee> ll= new ArrayList<>();
        ll.add(new Employee(156,"Jhon","IT",600000)  );
        ll.add(new Employee(155,"Vikas","MGR",900000)  );
        ll.add(new Employee(158,"Van","HR",500000)  );
        ll.add(new Employee(1100,"Derek","OPS",3400000)  );
        ll.add(new Employee(1400,"Brain","YTR",400000)  );
        return ll;
    }
}
