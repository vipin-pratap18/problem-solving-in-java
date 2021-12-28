package com.mislproblems;

public class MaxValue {


    //Time complexity = O(n), space complexity = O(1)
    public static int maxValue(int[] nums){
        int maxValue = 0;

        for(int num : nums){
            if(num > maxValue){
                maxValue = num;
            }
        }

        return maxValue;
    }

    public static void main(String[] args) {
        int[] a = new int[]{10, 2, 4 , 5, 6,7 ,8, 34};
        System.out.println(maxValue(a));
    }
    
}
