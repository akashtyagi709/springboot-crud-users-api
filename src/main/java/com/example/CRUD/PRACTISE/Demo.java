package com.example.CRUD.PRACTISE;

import java.util.*;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Demo");
        String s="Hello";
        String result="";
        for (int i=s.length()-1; i>=0; i--){
            System.out.println(s.charAt(i));
           result= result.concat(String.valueOf(s.charAt(i)));
        }

        System.out.println("Result "+result);
    }
}

class secondlargestnumber{

    public static void main(String[] args) {
        int num[]={11,21,32,21,25};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int i=0; i<num.length;i++){
            if(num[i]>largest){
                secondLargest=largest;
                largest=num[i];
            }
        }
        System.out.println("Largest is "+largest +" and Sceond largest is " +secondLargest);
    }

}

class frequency{

    public static void main(String[] args) {
        String name ="Test ";
        int[] freq=new int[256];

        for (int i =0;i<name.length();i++){
            if (name.charAt(i)==' '){
                continue;
            }
            freq[name.charAt(i)]++;
        }

        System.out.println(freq);
        for (int i=0 ; i<freq.length; i++){
            if (freq[i]>0){
                char ch=(char) i;
                System.out.println(ch+" ->  "+freq[i]);
            }
        }

    }


}

abstract class abstractone{
    int num=11;

    abstract void sound();
}

interface diff{
    int num1=11;
    void test();
}

class reverse {
    public static void main(String[] args) {
        String name = "test";
        for(int i=name.length()-1;i>=0;i--){
            System.out.print(name.charAt(i));
        }
    }
}

class palindrome{
    public static void main(String[] args) {
        String val="level";
        boolean isPal=true;
        for (int i=0; i<val.length()/2; i++){
            if (val.charAt(i) != val.charAt(val.length() - 1 - i)) {
                isPal = false;
                break;
            }
        }
        System.out.println(isPal);
    }
}

class Anagram{
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        boolean isAng=true;
        if (str1.length()!=str1.length()){
            isAng=false;
            return;
        }else{
            char[] a=str1.toCharArray();
            char[] b=str2.toCharArray();
            java.util.Arrays.sort(a);
            java.util.Arrays.sort(b);
            if (!java.util.Arrays.equals(a,b)){
                isAng=false;
            }
        }
        System.out.println(isAng);
    }
}

class charCount{
    public static void main(String[] args) {
        String str1="Testing data";
        int[] freq= new int[256];
        for (int i=0; i<str1.length(); i++){
            if (str1.charAt(i)==' '){
                continue;
            }
            freq[str1.charAt(i)]++;
        }
        for (int i=0; i<freq.length;i++){
            if (freq[i]>0){
                char ch=(char) i;
                System.out.println(ch+"  "+freq[i]);
            }
        }
    }
}

class duplicatecharacter {
    public static void main(String[] args) {
        String string="hello";
        for (int i = 0; i < string.length(); i++) {
            for (int j = i+1; j < string.length(); j++) {
                if (string.charAt(i)==string.charAt(j)){
                    System.out.println("Duplicate character  "+string.charAt(i));
                    break;
                }
            }
        }
    }
}

class RemoveDuplicates {
    public static void main(String[] args) {
        String string = "hello";
        String result = "";
        for (int i = 0; i < string.length(); i++) {
            boolean duplicate = false;
            for (int j = 0; j < result.length(); j++) {
                if (string.charAt(i) == result.charAt(j)) {
                    duplicate = true;
                    break;
                }
            }
            if (!duplicate) {
                result = result + string.charAt(i);
            }
        }
        System.out.println("Original String: " + string);
        System.out.println("After removing duplicates: " + result);
    }
}

class TopTenDifferenceQuestions{
    public static void main(String[] args) {

        ArrayList<Integer> arrayList= new ArrayList<>(2);
        arrayList.add(1);
        arrayList.add(12);
        arrayList.add(123);
        arrayList.add(100);
        System.out.println(arrayList);

        LinkedList<Integer> list= new LinkedList<>();
        list.add(12);
        list.addLast(1);
        list.addFirst(11);
        System.out.println(list);

        //HashMap, LinkedHashMap, and TreeMap

        Map<Integer,String> map = new HashMap<>();
        map.put(3,"c");
        map.put(1,null);
        map.put(null,null);
        System.out.println(map);

        Map<Integer,String> map1 = new LinkedHashMap<>();
        map1.put(3,"c");
        map1.put(1,null);
        map1.put(null,null);
        System.out.println(map1);

        Map<Integer,String> map2 = new TreeMap<>();
        map2.put(3,"c");
        map2.put(1,null);
        System.out.println(map2);


    }
}

class MyTask  extends Thread{
    public void run(){
        System.out.println("Running ...");
    }
}

class MyAnotherTask implements Runnable {
    @Override
    public void run() {
        System.out.println("Task is running");
    }
}

class ThreadMain{
    public static void main(String[] args) {
        MyTask myTask = new MyTask();
        Thread t = new Thread(new MyAnotherTask());
        myTask.start();
        t.start();
    }
}

@FunctionalInterface
interface Greeting{
    void sayHello();
}

@FunctionalInterface
interface  Add{
    int sum(int a , int b);
}

class lambda{
    public static void main(String[] args) {
        Greeting greeting= () -> System.out.println("Hello");
       greeting.sayHello();
        Add add=(a,b) -> a + b;
        System.out.println(add.sum(12,11));
        List<Integer> list= Arrays.asList(1,2,3,4,5,6);
        List<Integer> evennumber = list.stream()
                .filter(n-> n>4)
                .map(n-> n*n)
                .collect(Collectors.toList());
        System.out.println(evennumber);
        int totalSum=evennumber.stream().reduce(0,(a,b)->a+b);
        System.out.println(totalSum);
    }


}