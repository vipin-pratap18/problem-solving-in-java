package com.dynamicprogramming;

public class FibonaciSequence {

    public static int fibonaci(int n){
        if(n <= 2){
            return 1;
        }
        return fibonaci(n-1) + fibonaci(n-2);
    }


    public static void main(String[] args) {

        System.out.println(fibonaci(3));
        System.out.println(fibonaci(5));
        System.out.println(fibonaci(7));
        System.out.println(fibonaci(50)); 
        
    }
    
}
