package com.examples.problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author : VipinK
 */
public class FirstNonRepeatingCharacter {


    //Time complexity = O(n^2)
    //Space complexity = O(1)
    public static char findFirstNonRepeatedCharacterV1(String inputString){
        char[] input = inputString.toCharArray();
        int nonRepeatedIndex = 0;

        for(int i=0; i<input.length; i++){
            int repeat = 0;
            for(int j=0; j<input.length; j++){
                if(i == j){
                    continue;
                }

                if(input[i] == input[j]){
                    repeat = repeat + 1;
                }
            }

            if(repeat == 0){
                nonRepeatedIndex = i;
                break;
            }
        }

        return input[nonRepeatedIndex];

    }


    //Time complexity = O(n) + O(n) = O(n)
    //Space complexity = O(n)
    //Improved version
    public static char findFirstNonRepeatedCharacterV2(String inputString){
        Map<Character, Integer> charToFrequencyMap = new HashMap<>();

        char nonRepeatedChar = ' ';

        for(int i=0; i<inputString.length(); i++){
            Integer frequency = charToFrequencyMap.get(inputString.charAt(i));
            if(frequency == null){
                charToFrequencyMap.put(inputString.charAt(i), 1);
            }else{
                charToFrequencyMap.put(inputString.charAt(i), frequency + 1);
            }
        }

        for(int i=0; i<inputString.length(); i++){
            if(charToFrequencyMap.get(inputString.charAt(i)) == 1){
                nonRepeatedChar = inputString.charAt(i);
                break;
            }
        }
        return nonRepeatedChar;

    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        char result = findFirstNonRepeatedCharacterV2(inputString);
        System.out.println(result);
    }
}
