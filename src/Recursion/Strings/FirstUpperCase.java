package Recursion.Strings;

import java.util.Scanner;


public class FirstUpperCase {
    static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        String s = sc.nextLine();
        System.out.println(firstUP(s));
    }
    public static char firstUP(String s){
        return helper(s,0);
    }
    public static char helper(String s,int i){
        if(i>=s.length()){
            return '!';
        }
        if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
            return s.charAt(i);
        }
        return helper(s,i+1);
    }

}
