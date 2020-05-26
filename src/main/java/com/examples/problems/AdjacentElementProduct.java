package com.examples.problems;

import java.util.*;

/**
 * @author : VipinK
 */
public class AdjacentElementProduct {



    public static int adjacentElementsMaxProduct(int[] inputArray){

        /*
        Given an array of integers, find the pair of adjacent elements that has the largest product and return that product.

Example

For inputArray = [3, 6, -2, -5, 7, 3], the output should be
adjacentElementsProduct(inputArray) = 21.

7 and 3 produce the largest product.

Input/Output

[execution time limit] 3 seconds (java)

[input] array.integer inputArray

An array of integers containing at least two elements.

Guaranteed constraints:
2 ≤ inputArray.length ≤ 10,
-1000 ≤ inputArray[i] ≤ 1000.

[output] integer

The largest product of adjacent elements.
         */
        //Solution
        int maxProduct = inputArray[0]*inputArray[1];
        for(int i=0; i<inputArray.length; i++){
            if(i+1 > inputArray.length-1){
                continue;
            }
            int product = inputArray[i]*inputArray[i+1];
            if(maxProduct < product){
                maxProduct = product;
            }
        }
        return maxProduct;

        //Complexity Analysis
        //Space complexity O(1) an extra array declared to hold the diff
        //Time complexity O(n), worst case one loops will execute till arrays full length
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] array1 = scanner.nextLine().split(" ");
        int[] a = new int[array1.length];
        for(int i=0; i<array1.length; i++){
            a[i] = Integer.parseInt(array1[i]);
        }
        System.out.println(adjacentElementsMaxProduct(a));
    }
}
