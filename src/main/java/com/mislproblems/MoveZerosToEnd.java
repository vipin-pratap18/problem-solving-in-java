package com.mislproblems;

/*
 * Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.



Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:

Input: nums = [0]
Output: [0]


Constraints:

1 <= nums.length <= 104
-231 <= nums[i] <= 231 - 1


Follow up: Could you minimize the total number of operations done?
 */
public class MoveZerosToEnd {

    /*
     * Time complexity = O(n), Space complexity = O(1)
     */
    public static int[] moveZerosToEnd(int[] arr){
        int zeroPointer = 0;
        int nonZeroPointer = 0;

        for(int i=1; i<arr.length; i++){
            nonZeroPointer = i;
            if(arr[zeroPointer] == 0 && arr[nonZeroPointer] != 0){
                arr[zeroPointer] = arr[nonZeroPointer];
                arr[nonZeroPointer] = 0;
                zeroPointer = zeroPointer + 1;
            } else if(arr[zeroPointer] != 0 && arr[nonZeroPointer] == 0){
                zeroPointer = nonZeroPointer;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] input1 = new int[]{0,1,0,3,12};
        int[] input2 = new int[]{0};
        int[] input3 = new int[]{1,0,0,3,12, 6, 8, 0, 10};
        int[] input4 = new int[]{1,2,0,3,12, 6, 8, 0, 10};

        System.out.print("Array after moving all the zeros to the end: [ ");
        int[] output = moveZerosToEnd(input4);
        for(int a: output){
            System.out.print(a + " ");
        }
        System.out.print("]");
    }
}
