package com.revature.main;

import java.util.HashMap;

import com.revature.data_structures.Stack;

public class Driver {
    public static void main(String[] args) {
        String word = "the quick brown fox jumped over the lazy dog";
        System.out.println(reverseAWord(word));
        String line = "a{b(c[d]e)f}";
        System.out.println(checkDelimeter(line));
    }
    public static String reverseAWord(String word) {
        Stack stack = new Stack(word.length());
        String output = "";
        for(char c : word.toCharArray()) {
            stack.push(c);
        }
        while(!stack.isEmpty()) {
            char c = (char) stack.pop();
            output += c;
        }
        return output;
    }
    public static boolean checkDelimeter(String line) {
        HashMap<Character, Character> map = new HashMap<>();
        Stack stack = new Stack(line.length());
        for(int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            switch(c) {
            case '{':
            case '[':
            case '(':
                stack.push(c);
                break;
            case '}':
            case ']':
            case ')':
                if(!stack.isEmpty()) {
                    char pc = (char) stack.pop();
                    if((pc == '{' && c!='}')||
                            (pc=='(' && c!=')')||
                            (pc == '[' && c!=']')) {
                        System.out.println("Error: " + c + " at " +i);
                        return false;
                    }
                }
                else {
                    break;
                }
             default:
                 break;
            }
        }
        System.out.println(stack.isEmpty());
        return stack.isEmpty();
    }
}
