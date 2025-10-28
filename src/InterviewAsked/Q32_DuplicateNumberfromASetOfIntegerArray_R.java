package InterviewAsked;


import java.util.*;

public class Q32_DuplicateNumberfromASetOfIntegerArray_R {

    //Find the duplicate number from an integer array

    public static void main(String[] args) {
        int inputArr[] = {2,5,6,7,6,8,2,9,9};

        //Brute force method:
        for (int i = 0; i < inputArr.length ; i++) {
            for (int j = i+1; j <inputArr.length; j++) {
                if (inputArr[i] == inputArr[j]){
                    System.out.println("Brute force Duplicate:" + inputArr[i]);
                }
            }
        }

        //Using sorting method:
        Arrays.sort(inputArr);
        for (int i = 0; i < inputArr.length-1; i++) {
            if (inputArr [i] == inputArr [i+1]){
                System.out.println("Using sorting method Duplicate: "+inputArr[i]);
            }
        }

        //Using HashSet:
        Set <Integer> hs = new HashSet<>();
        for (int x : inputArr) {

            //Only print duplicate value
            if (hs.add(x) == false) {  //we can use this > !hs.add(x)
                // hs.add(x) == true: print all unique values in HashSet
                // hs.add(x) == false: Print only duplicte value in HashSet
                // false == false : print that duplicate value
                System.out.println("Using HashSet Duplicate: " + x);
            }
        }

        // Using HashMap:
        Map <Integer,Integer> map = new HashMap<>();
        for ( int x : inputArr) {
            if (!map.containsKey(x)){
                map.put(x, 1);
            }else {
                map.put(x, map.get(x)+1);
            }
        }
        for (int x : map.keySet()){
            if (map.get(x) > 1){
                System.out.println("HashMap value: " + x);
            }
        }
    }
}