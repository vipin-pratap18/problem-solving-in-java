package com.mislproblems;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author : VipinK
 */
public class ArrayRotation {

    /**
     * @param a
     * @param d
     * @return
     */
    public static int[] rotateLeftV1(int []a,  int d){

        //Solution
        for(int i=0; i<d; i++){
            int b = a[0];
            for(int j=0; j<a.length; j++){
                if(j+1 > a.length-1)
                    continue;
                a[j] = a[j+1];
            }
            a[a.length-1] = b;
        }
        return a;

        //Complexity Analysis
        //Space complexity O(1) no extra space except new variable b used
        //Time complexity O(n^2), worst case two loops will execute till arrays full length = ixj = loop1xloop2
    }

    public static int[] rotateLeftV2(int []a,  int d){

        //Solution
        int[] b = new int[a.length];
        int currentElementIndex = 0;
        for(int i = d, j=0; i<a.length; i++, j++){
            b[j] = a[i];
            currentElementIndex = j;
        }

        for(int i=0, j=currentElementIndex+1; j<b.length; i++, j++){
            b[j] = a[i];
        }

        return b;

        //Complexity Analysis
        //Space complexity O(n) an extra array declared to hold the rotated array
        //Time complexity O(n), worst case two loops will execute till arrays full length = loop1 + loop2 = n + n = O(n)
    }



    public static void main(String[] args) {

        //Input Format
        //case-1
        //5 4
        //1 2 3 4 5

        //case
        //20 10
        //41 73 89 7 10 1 59 58 84 77 77 97 58 1 86 58 26 10 86 51
        Scanner scanner = new Scanner(System.in);
        String[] arrayLengthRotation = scanner.nextLine().split(" ");
        int arrayLength = Integer.parseInt(arrayLengthRotation[0]);
        int rotation = Integer.parseInt(arrayLengthRotation[1]);
        String[] array = scanner.nextLine().split(" ");
        int[] a = new int[array.length];
        if(array.length != arrayLength){
            throw new IllegalArgumentException("Input array size is not matching with the initial entered size");
        }
        for(int i=0; i<array.length; i++){
            a[i] = Integer.parseInt(array[i]);
        }
        int[] result = rotateLeftV2(a, rotation);
        Arrays.stream(result).forEach((value) -> {
            System.out.print(value + " ");
        });
    }
}
