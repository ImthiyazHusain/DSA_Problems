package Recursion.Strings;

import java.util.Scanner;

public class countVowels {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(countVowels(s));
    }
    public static int countVowels(String s){
        return helper(s,0,0);
    }
    public static int helper(String s,int count,int i){
        if(i==s.length()){
            return count;
        }
        if(isVowel(s.charAt(i))){
            count++;
        }
         return helper(s,count,i+1);
    }
    public static boolean isVowel(char c){
        return "AEIOUaeiou".indexOf(c)!=-1;
    }
}
