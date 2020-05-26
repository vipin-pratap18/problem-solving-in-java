package com.examples.problems;

import java.util.Scanner;

/**
 * @author : VipinK
 */
public class LastKElementProduct {

    /*
     * Solution Explanation
     * // input stream containing ints
// at any point based on input k return product of last k elements

P   1 2 0 0 0 0 -> P[6]/P[6-2]  for k=2
   1 2 2 8 40 40
// 1 2 0 4 5 1 Prod(k=2) -> 5
// 1 2 0 4 5 0 3 2 2 (k = 5) -> 0
    1 2 2 8 40 40 120 240 480                        (k = 3) -> 480/40 -> 12
Consideration:
Constant stream of data appending elements in the last of array
Point in time calculation
Saving the previous calculation if possible

P[6]/P[6-2]  given P[n-k] > last 0 index

//1. To handle streaming, if the array a contains all the element from starting then previous //calculation array and product array needs to be saved outside this method, along with the //previous indexes.
//2. If array a contains only the new elements, then this array will be merged with the //previous one and calculate the product for the difference
     */

    public static int lastKElementProduct(int[] a, int k){
        int lastKElementProduct = -1;
        if(k > a.length){
            return lastKElementProduct;
        }

        int[] productArray = new int[a.length];
        int lastZeroIndex = -1;
        productArray[0] = a[0];
        for(int i=1; i<a.length; i++){
            if(a[i] == 0){
                productArray[i] = 1 * productArray[i-1];
                lastZeroIndex = i;
            }else{
                productArray[i] = a[i] * productArray[i-1];
            }
        }

        int n = productArray.length-1;
        if(n-k > lastZeroIndex){
            lastKElementProduct = productArray[n]/productArray[n-k];
        }else{
            lastKElementProduct = 0;
        }
        return lastKElementProduct;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] array = scanner.nextLine().split(" ");
        int[] a = new int[array.length];
        for(int i=0; i<array.length; i++){
            a[i] = Integer.parseInt(array[i]);
        }
        int kElement = Integer.parseInt(scanner.nextLine().trim());
        int product = lastKElementProduct(a, kElement);
        System.out.println(product);
    }
}
