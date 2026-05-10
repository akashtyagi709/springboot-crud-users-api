package com.example.CRUD.PRACTISE;
import java.util.*;
import java.util.stream.Collectors;

public class Array {
    public static void main(String[] args) {
        List<Employee> list= new ArrayList<>();
        list.add(new Employee(1,"Akash",34400));
        list.add(new Employee(2,"Ravi",50000));
        list.add(new Employee(3,"Rohan",1000));
//        System.out.println("HIIIII "+list.toString());
//        Map<Integer,Employee> map= new HashMap<>();
//        for (Employee emp:list){
//            if (emp.salary>5000){
//                map.put(emp.id,emp);
//            }
//        }
//        for (Map.Entry<Integer,Employee> entry:map.entrySet()){
//            Employee e= entry.getValue();
//            System.out.println(e.name+" "+e.salary);
//        }

        Map<Integer ,Employee> map= list.stream()
                .filter(employee -> employee.salary>5000)
                .collect(Collectors.toMap(employee -> employee.id,employee -> employee));
        map.values()
                .forEach(employee -> System.out.println(employee.name + " "+ employee.salary));
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

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}