package com.jlab.java.serial;

import java.io.*;

public class ExternilationCheks {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        /*Employee e = new Employee();
        e.setId(123);
        e.setName("Jacob");
        FileOutputStream fs = new FileOutputStream(new File("employee.ser"));
        ObjectOutputStream os = new ObjectOutputStream(fs);
        os.writeObject(e);
        os.close();
        fs.close();*/

        FileInputStream fis = new FileInputStream(new File("employee.ser"));
        ObjectInputStream ois = new ObjectInputStream(fis);
        Employee emp = (Employee) ois.readObject();
        System.out.println(emp.getName());
        fis.close();
        ois.close();
    }
}

// We need the customize machenism to serialize and deserialize the object
//if we want to ignore 95 attribute then i have use 99 times transiant keword therefore externalization comes in picture
class Employee implements Externalizable {

    String name;
    int id;

    @Serial
    private static final long serialVersionUID = 5215763999552498009L;

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
       // out.write(name);
        out.writeObject(name);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        name = (String) in.readObject();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}