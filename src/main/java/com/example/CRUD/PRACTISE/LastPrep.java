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
        if (s1.length()!=s2.length()){
            System.out.println("Not Anangram");
            return;
        }
        for (int i = 0; i < s1.length(); i++) {
            freq1[s1.charAt(i)]++;
        }
        for (int i = 0; i < s2.length(); i++) {
            freq2[s2.charAt(i)]++;
        }

        boolean isAnagram =true;
        for (int i = 0; i < freq1.length; i++) {
            if (freq1[i]!=freq2[i]){
                isAnagram=false;
                break;
            }
        }
        if (isAnagram){
            System.out.println("Yes it's an Anangram");
        }else {
            System.out.println("Not an Anagram");
        }

        int[] removeDuplicates = {1,2,2,3,4,4,5};
        Set set1 = new HashSet();
        for (int i = 0; i < removeDuplicates.length; i++) {
                set1.add(removeDuplicates[i]);
        }

        System.out.println("removed duplicated " +set1);
        int[] moveZero={1,0,2,0,3,4,0};
        for (int i = 0; i < moveZero.length; i++) {
            for (int j = i+1; j < moveZero.length; j++) {
                if (moveZero[i]==0 & moveZero[j]!=0){
                        int temp = moveZero[i];
                        moveZero[i] = moveZero[j];
                        moveZero[j] = temp;
                }
                }

        }
        System.out.println("First " + Arrays.toString(moveZero));
        int[] sortArray = {4,2,8,1,9};
        for (int i = 0; i < sortArray.length; i++) {
            for (int j = i+1; j < sortArray.length; j++) {
                if (sortArray[i]<sortArray[j]){
                    int temp = sortArray[i];
                    sortArray[i]=sortArray[j];
                    sortArray[j]=temp;
                }
            }
        }
        System.out.println( "Largest "+sortArray[0]);
        System.out.println( "Smallest  "+sortArray[sortArray.length-1]);
    }
}
