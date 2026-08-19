package com.example.CRUD.PRACTISE;
import java.util.*;

public class LastPrep {
    public static void main(String[] args) {
        String str="Binary";
        StringBuilder output=new StringBuilder();
        for (int i=str.length()-1; i>=0; i--){
            output=output.append(str.charAt(i));
        }
        System.out.println(output);
        String myStr="madam";
        boolean isPal=true;
        for (int i = 0; i < myStr.length()/2; i++) {
            if (myStr.charAt(i)!=myStr.charAt(myStr.length()-i-1)){
                isPal=false;
            }
        }
        System.out.println("Palindrome result "+isPal);
        int[] arr = {10, 5, 20, 8, 20, 15};
        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            if (arr[i]>largest){
                secondLargest=largest;
                largest=arr[i];
            }else if (arr[i]>secondLargest && arr[i]<largest){
                secondLargest=arr[i];
            }
        }
        System.out.println("Second largest "+secondLargest);
        String freqStr = "banana";
        int[] freq= new int[256];
        for (int i = 0; i < freqStr.length(); i++) {
            freq[freqStr.charAt(i)]++;
        }
        for (int j = 0; j < freq.length; j++) {
            if (freq[j]>0){
            char ch=(char) j;
            System.out.println(ch +" --> "+freq[j]);
        }
        }
        int[] newArr = {1, 2, 3, 4, 2, 5, 3, 6, 3};
        Set set= new HashSet();
        Set dup = new HashSet();
        for (int i = 0; i < newArr.length; i++) {
            if (!set.contains(newArr[i])){
                set.add(newArr[i]);
            }else{
                dup.add(newArr[i]);
            }
        }
        System.out.println("Unique Elements " + dup);
        String nonRepStr = "aabbccde";
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < nonRepStr.length(); i++) {
            map.put(nonRepStr.charAt(i),map.getOrDefault(nonRepStr.charAt(i),0)+1);
        }
        for (int i = 0; i <nonRepStr.length(); i++) {
            char ch = nonRepStr.charAt(i);
            if (map.get(ch)==1){
                System.out.println("First non-repeated "+ch);
                break;
            }
        }
        int[] twoSumArr = {2, 7, 11, 15};
        int target = 9;
        for (int i = 0; i < twoSumArr.length; i++) {
            for (int j = i+1; j < twoSumArr.length; j++) {
                if (twoSumArr[i]+twoSumArr[j]==target){
                    System.out.println(
                            twoSumArr[i] + " + " + twoSumArr[j] +" = " + target
                    );
                }
            }
        }
        int[] missingArr = {1, 2, 3, 5, 6};
        int missingNumber=0;
        for (int i = 0; i < missingArr.length-1; i++) {
            if (missingArr[i+1]-missingArr[i]!=1){
                missingNumber= missingArr[i]+1;
            }
        }
        System.out.println("Missing number "+missingNumber);

        String s1 = "listen";
        String s2 = "silent";
        int[] freq1 = new int [256];
        int[] freq2 = new int [256];


    }
}