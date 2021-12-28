package com.mislproblems;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author : VipinK
 */
public class KthNonRepeatingCharacter {

    //Time complexity = O(n) + O(n) = O(n)
    //Space complexity = O(n)
    public static char findKthNonRepeatedCharacterV1(String inputString, int k){
        Map<Character, Integer> charToFrequencyMap = new HashMap<>();

        char nonRepeatedChar = ' ';
        int kthPosition = 1;
        if(k <= 0){
            System.out.println("K can not be 0 or less than 0");
            return nonRepeatedChar;
        }

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
                if(kthPosition == k) {
                    nonRepeatedChar = inputString.charAt(i);
                    break;
                }else{
                    kthPosition++;
                }
            }
        }
        return nonRepeatedChar;

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        char result = findKthNonRepeatedCharacterV1(inputString, 3);
        System.out.println(result);
    }
}
