package com.revature.main;

import java.util.HashSet;

import com.revature.data_structures.Link;
import com.revature.data_structures.LinkedList;

public class Driver {
    public static void main(String[] args) {
       String s1 = "wouldyoulikefries";
       String s2 = "abcabcabcabcabcabc";
       System.out.println(checkStrings(s1, s2));
    }
    public static String checkStrings(String s1, String s2) {
        HashSet<String> set = new HashSet<String>();
        
        if(s1.length() == 0 || s2.length() ==0) {
            return "NO";
        }
        //add if you can add it, remove it
        for(int i = 0; i < s1.length(); i++) {
            System.out.print(s1.toCharArray()[i]);
            set.add(Character.toString(s1.toCharArray()[i]));
        }
        System.out.println("");
        for(int j = 0; j < s2.length(); j++) {
            if(set.add(Character.toString(s2.toCharArray()[j]))) {
                set.remove(Character.toString(s2.toCharArray()[j]));
            }
            else {
                return "YES";
            }
        }
        return "NO";
        
        
    }
    /**
     * s1 = dog;
     * hs = d, o, g
     * 
     * s1 = aaa;
     * 
     * 
     */
}
