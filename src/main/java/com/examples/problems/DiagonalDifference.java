package com.examples.problems;

/**
 * @author : VipinK
 */
public class DiagonalDifference {

    public static int diagonalDifference(int[][] a){
        //Square matrix condition first
        int rows = a.length;
        int columns = a[0].length;
        int left_to_right_sum = 0;
        int right_to_left_sum = 0;
        for(int i=0; i<rows; i++){

        }

        return Math.abs(left_to_right_sum - right_to_left_sum);
    }

    public static void main(String[] args) {

    }
}
