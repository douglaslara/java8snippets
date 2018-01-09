package com.codify.guidewire;

import java.util.*;

public class CodilitySample {
    public static int main(String... S) {
        
        Stack<Integer> intStack = new Stack<Integer>();
        
        //String[] tokens = S.split(" ");
        
        String[] tokens = S;
        try {
        for(String s: tokens){
            switch(s) {
            case "DUP":
            	Integer dup = (Integer) intStack.peek();
            	intStack.push(dup);
            	break;
            case "POP":
            	intStack.pop();
            	break;
            case "+":
            	Integer firstSum = intStack.pop();
            	Integer secondSum = intStack.pop();
            	intStack.push(firstSum  + secondSum);
            	break;
            case "-": 
            	Integer firstSub = intStack.pop();
            	Integer secondSub = intStack.pop();
            	intStack.push(firstSub - secondSub);
            	break;
            default:
            	intStack.push(Integer.parseInt(s));
            	break;
            }
        }
        } catch (Exception e) {
        	return -1;
        }
        return intStack.peek();
    }
}
