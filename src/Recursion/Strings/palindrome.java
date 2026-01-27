package Recursion.Strings;

import java.util.*;
public class palindrome{
	public static void main(String[] args) {
		String s = "HellolleH";
		System.out.print(palin(s));
	}
public static boolean palin(String s){
	    if(s.length()<=1) return true;
	    
	    char first = s.charAt(0);
	    char last = s.charAt(s.length()-1);
	    String mid = s.substring(1,s.length()-1);
	    
	    return first == last && palin(mid);
	}
}