package com.mislproblems;

import java.util.*;

/**
 * @author : VipinK
 */
public class SumOfTwoArrays {


    /*
     * You have two integer arrays a and b and an integer target value v. Determine whether there is a pair of numbers,
     * where one number is taken from a and the other from b, that can be added together to get a sum of v.
     * Return true if such a pair exists, otherwise return false.
     */

    public static boolean sumOfTwoArrayToTargetV1(int[] a, int [] b, int c){

        //Solution
        List<String> pairOfMatch = new ArrayList<>();
        for(int i=0; i<a.length; i++){
            int diff = c - a[i];
            for(int j=0; j<b.length; j++){
                if(diff == b[j]){
                    String pair = a[i] + "," + b[j];
                    pairOfMatch.add(pair);
                    //return true;
                }
            }
            pairOfMatch.stream().forEach(System.out::println);
        }
        return false;

        //Complexity Analysis
        //Space complexity O(1) an extra array declared to hold the diff
        //Time complexity O(n^2), worst case two loops will execute till arrays full length = loop1 x loop2 = n x n = O(n^2)
    }

    public static boolean sumOfTwoArrayToTargetV2(int[] a, int [] b, int c){

        //Solution
        List<String> pairOfMatch = new ArrayList<>();
        Map<Integer, Integer> diffToNumber = new HashMap<>();
        Set<Integer> differences = new HashSet<>();
        for(int i=0; i<a.length; i++){
            int diff = c - a[i];
            differences.add(diff);
            diffToNumber.put(diff, a[i]);
        }

        for(int j=0; j<b.length; j++){
            if(diffToNumber.containsKey(b[j])){
                String pair = diffToNumber.get(b[j]) + "," + b[j];
                pairOfMatch.add(pair);
                //return true;
            }
        }

        pairOfMatch.stream().forEach(System.out::println);

        return false;

        //Complexity Analysis
        //Space complexity O(n) an extra array declared to hold the rotated array for hashset
        //Time complexity O(n), worst case two loops will execute till arrays full length = loop1 + loop2 = n + n = O(n)
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] array1 = scanner.nextLine().split(" ");
        int[] a = new int[array1.length];
        for(int i=0; i<array1.length; i++){
            a[i] = Integer.parseInt(array1[i]);
        }

        String[] array2 = scanner.nextLine().split(" ");
        int[] b = new int[array2.length];
        for(int i=0; i<array2.length; i++){
            b[i] = Integer.parseInt(array2[i]);
        }

        int target = Integer.parseInt(scanner.nextLine().trim());
        System.out.println(sumOfTwoArrayToTargetV2(a, b, target));
    }
}
