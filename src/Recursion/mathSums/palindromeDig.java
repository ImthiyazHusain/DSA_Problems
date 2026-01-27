package Recursion.mathSums;

import java.util.*;
public class palindromeDig{
	public static void main(String[] args) {
		int n = 121219;
        if(n<0) n = n*-1;
		System.out.print(palin(n));
	}
	public static boolean palin(int n){
	    if(n<10) return true;
	    
	    int first = n/(int)(Math.pow(10,(int)Math.log10(n/10)+1));
	    int last = n%10;
	    int mid = (n-((int)(Math.pow(10,(int)Math.log10(n/10)+1)))*first)/10;
	    
	    return first == last && palin(mid);
	}
}