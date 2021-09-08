package com.examples.problems;

public class LongestSubArrayBySum {

    public static int[] findLongestArrayBySum(int[] arr, int s){
        int[] result = new int[] {-1};
        
        int sum = 0;
        int left = 0;
        int right = 0;
        while(right < arr.length){
            sum = sum + arr[right];
            while(left < right && sum > s){
                sum = sum - arr[left++];
            }

            if (sum == s && (result.length == 1 || result[1] - result[0] < right - left)){
                result = new int[]{left + 1, right + 1};
            }
            right++;
        }
        
        return result;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 0, 0, 0, 6, 7, 8, 9, 10};
        int sum = 15;
        int[] result = findLongestArrayBySum(arr, sum);
        System.out.print("[");
        for(int i=0; i<result.length; i++){
            System.out.print(result[i] + ", ");
        }
        System.out.print("]");
        
    }
}
