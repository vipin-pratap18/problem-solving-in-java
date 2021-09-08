package com.examples.problems;
import java.io.*;
import java.util.*;

/*
You are running a classroom and suspect that some of your students are passing around the answers to multiple choice questions disguised as random strings.

Your task is to write a function that, given a list of words and a string, finds and returns the word in the list that is scrambled up inside the string, if any exists. There will be at most one matching word. The letters don't need to be in order or next to each other. The letters cannot be reused.

Example:
words = ['cat', 'baby', 'dog', 'bird', 'car', 'ax']
string1 = 'tcabnihjs'
find_embedded_word(words, string1) -> cat (the letters do not have to be in order)

string2 = 'tbcanihjs'
find_embedded_word(words, string2) -> cat (the letters do not have to be together)

string3 = 'baykkjl'
find_embedded_word(words, string3) -> None / null (the letters cannot be reused)

string4 = 'bbabylkkj'
find_embedded_word(words, string4) -> baby

string5 = 'ccc'
find_embedded_word(words, string5) -> None / null

string6 = 'breadmaking'
find_embedded_word(words, string6) -> bird

W = number of words in `words`
L = maximal length of each word or string


*/

public class WordInScrambledString {

    /*
     *  Time Complexity = O(n^2), Space complexity = O(n)
     */
    public static String find_embeded_word(String[] words, String pattern){

        //Assumption that, there could be only one match or no match at all from the  collection of words in the matched string
        Map<Character, Integer> patternMap = pushInHashMap(pattern);

        for(String word : words){
            Map<Character, Integer> wordMap = pushInHashMap(word);
            int wordLength = wordMap.size();
            int matchFlag = 0;

            for(Character wordKey : wordMap.keySet()){
                Integer occurrence = patternMap.get(wordKey);
                if(occurrence == null || occurrence == 0){
                    continue;
                }
                if(occurrence >= wordMap.get(wordKey)){
                    matchFlag = matchFlag + 1;
                    continue;
                }else{
                    continue;
                }
            }
            if(wordLength == matchFlag){
                return word;
            }
        }
        return null;
    }

    public static Map<Character, Integer> pushInHashMap(String word){
        Map<Character, Integer> toBeFilledMap = new HashMap<>();
        for(Character character : word.toCharArray()){
            if(toBeFilledMap.containsKey(character)){
                toBeFilledMap.put(character, toBeFilledMap.get(character) + 1);
            }else{
                toBeFilledMap.put(character, 1);
            }
        }
        return toBeFilledMap;
    }

    public static void main(String[] argv) {

        String[] words = new String[] { "cat", "baby", "dog", "bird", "car", "ax"};
        String string1 = "tcabnihjs";
        String string2 = "tbcanihjs";
        String string3 = "baykkjl";
        String string4 = "bbabylkkj";
        String string5 = "ccc";
        String string6 = "breadmaking";
        System.out.println(find_embeded_word(words, string6));


    }
}
