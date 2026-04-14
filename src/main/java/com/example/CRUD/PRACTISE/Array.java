package com.example.CRUD.PRACTISE;
import java.util.*;

public class Array {
    public static void main(String[] args) {
//        int[] arr={1,2,3,2,1,4,5};
//        Set<Integer> set = new HashSet<>();
//        for (int num:arr){
//            set.add(num);
//        }
//        System.out.println(Arrays.toString(arr)+" result "+set);
//        List<Integer> list= new ArrayList<>();
//        for (int num:arr){
//            if (!list.contains(num)){
//                list.add(num);
//            }
//        }
//        System.out.println(list);

        List<Employee> list= new ArrayList<>();
        list.add(new Employee(1,"Akash",34400));
        list.add(new Employee(2,"Ravi",50000));
        list.add(new Employee(3,"Rajesh",1000));

        Map<Integer,Employee>map= new HashMap<>();
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