package com.example.CRUD.PRACTISE;
import java.util.*;

public class Array {
    public static void main(String[] args) {
        List<Employee> list= new ArrayList<>();
        list.add(new Employee(1,"Akash",34400));
        list.add(new Employee(2,"Ravi",50000));
        list.add(new Employee(3,"Rohan",1000));
        System.out.println("HIIIII "+list);
        Map<Integer,Employee> map= new HashMap<>();
        for (Employee emp:list){
            if (emp.salary>5000){
                map.put(emp.id,emp);
            }
        }
        for (Map.Entry<Integer,Employee> entry:map.entrySet()){
            Employee e= entry.getValue();
            System.out.println(e.name+" "+e.salary);
        }
    }
}

class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}