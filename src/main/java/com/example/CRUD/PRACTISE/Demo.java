package com.example.CRUD.PRACTISE;

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

class palindrome{
    public static void main(String[] args) {
        String pal="aahaa";
        boolean isPal=true;
        for (int i =0; i<pal.length()/2 ; i++){
            if (pal.charAt(i) != pal.charAt(pal.length()-1-i)){
                isPal=false;
                break;
            }
        }
        System.out.println("Result of palindrome "+ isPal);

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
        String name ="Akash ";
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

