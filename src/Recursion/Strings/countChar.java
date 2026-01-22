package Recursion.Strings;

import java.util.Scanner;

//count only char no numbers and special chars;
public class countChar {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(count(s));
    }
    public static int count(String s){
        return helper(s,0,0);
    }
    public static int helper(String s,int count,int i){
        if(i==s.length()){
            return count;
        }
        if(s.charAt(i)>='a' && s.charAt(i)<='z' || s.charAt(i)>='A' && s.charAt(i)<='Z'){
            count++;
        }
        return helper(s,count,i+1);
    }
}
