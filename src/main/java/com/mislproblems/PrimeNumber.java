package com.mislproblems;

public class PrimeNumber {

    /*
    is prime

Write a function, isPrime, that takes in a number as an argument. The function should return a boolean indicating whether or not the given number is prime.

A prime number is a number that is only divisible two distinct numbers: 1 and itself.

For example, 7 is a prime because it is only divisible by 1 and 7. For example, 6 is not a prime because it is divisible by 1, 2, 3, and 6.

You can assume that the input number is a positive integer.

     */
    public static boolean isPrime(int num){
        if(num < 2){
            return false;
        }

        //Linear time O(n)
//        for(int i=2; i<num; i++){
//            if(num%i == 0){
//                return false;
//            }
//        }


        //Time complexity = O(sqrt(n))
        for(int i=2; i<=Math.sqrt(num); i++){
            if(num%i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println(isPrime(6));
    }
    
}
