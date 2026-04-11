package com.example.CRUD.NATIVE;

import java.util.*;

public class Array {
    public static void main(String[] args) {
        int[] arr={1,2,3,2,1,4,5};
        Set<Integer> set = new HashSet<>();
        for (int num:arr){
            set.add(num);
        }
        System.out.println(Arrays.toString(arr)+" result "+set);

        List<Integer> list= new ArrayList<>();
        for (int num:arr){
            if (!list.contains(num)){
                list.add(num);
            }
        }
        System.out.println(list);

    }
}
