package com.mislproblems;

import java.util.Scanner;

/**
 * @author : VipinK
 */
public class CenturyFromYear {

    /*
    Example

For year = 1905, the output should be
centuryFromYear(year) = 20;
For year = 1700, the output should be
centuryFromYear(year) = 17.
Input/Output

[execution time limit] 3 seconds (java)

[input] integer year

A positive integer, designating the year.

Guaranteed constraints:
1 ≤ year ≤ 2005.

[output] integer

The number of the century the year is in.
     */

    public static int centuryFromYear(int year){
        int century = 0;
        if(year%100 == 0){
            century = year/100;
        }else{
            century = year/100 + 1;
        }
        return century;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = Integer.parseInt(scanner.nextLine().trim());
        if(year < 1 && year > 2005){
            throw new IllegalArgumentException("Entered year can not be less tha 1 and greater than 2005");
        }
        System.out.println(centuryFromYear(year));
    }
}
