package com.examples.problems;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author : VipinK
 */
public class SortedSquaredArray {

    /*
     * You have a sorted array of integers, write a functio that returns a sorted array containing the squares of those
     * integers
     */

    public static int[] sortedSquaredArrayV1(int[] a ){

        //Solution
        int[] squaredArray = new int[a.length];
        for(int i=0; i<a.length; i++){
            squaredArray[i] = a[i]*a[i];
        }

        Arrays.sort(squaredArray);
        return squaredArray;

        //Complexity Analysis
        //Space complexity O(n) an extra array declared to hold the squared array
        //Time complexity O(nlogn), O(n) for creating a squared array and O(nlogn) for sorting the squared array

    }


    public static int[] sortedSquaredArrayV2(int[] a ){

        //Solution //Will be back on this for implementation
        int[] squaredArray = new int[a.length];
        for(int i=0; i<a.length; i++){
            squaredArray[i] = a[i]*a[i];
        }

        Arrays.sort(squaredArray);
        return squaredArray;

        //Complexity Analysis
        //Space complexity O(n) an extra array declared to hold the squared array
        //Time complexity O(nlogn), O(n) for creating a squared array and O(nlogn) for sorting the squared array

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] array1 = scanner.nextLine().split(" ");
        int[] a = new int[array1.length];
        for(int i=0; i<array1.length; i++){
            a[i] = Integer.parseInt(array1[i]);
        }

        int[] result = sortedSquaredArray(a);
        Arrays.stream(result).forEach(System.out::println);
    }
}
