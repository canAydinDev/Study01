package leetcode;

import java.util.HashMap;

/*
   Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.



Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false
 */
public class Anagram {
    public static void main(String[] args) {
       String s = "anagram";
        String t = "aaanggram" ;
        isAnagram(s,t);
    }
    public static boolean isAnagram(String s, String t) {

        HashMap<String, Integer> hashS=new HashMap<>();
        HashMap<String, Integer> hashT=new HashMap<>();
        ;
        for (int i=0;i<s.length(); i++){
            String s1=String.valueOf(s.charAt(i));
            if (hashS.containsKey(s1)){
                Integer counter=hashS.get(s1);
                hashS.put(s1,counter+1);
            }else{
                hashS.put(s1,1);
            }
        }
        System.out.println(hashS);
        for (int i=0;i<t.length(); i++){
            String t1=String.valueOf(t.charAt(i));
            if (hashT.containsKey(t1)){
                Integer counter=hashT.get(t1);
                hashT.put(t1,counter+1);
            }else{
                hashT.put(t1,1);
            }
        }
        System.out.println(hashT);
        if (hashS.equals(hashT)){
            return true;
        }
        return false;
    }
}
