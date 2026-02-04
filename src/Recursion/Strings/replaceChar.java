package Recursion.Strings;

import java.util.Scanner;

public class replaceChar {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char c = sc.next().charAt(0);
        char r = sc.next().charAt(0);

        System.out.println(replace(s,c,r));
    }
    public static String replace(String s,char c,char r){
        return helper(s,c,r,0);
    }
    public static String helper(String s,char c,char r,int i){
        if(i>=s.length()){
            return "";
        }
        char curr = s.charAt(i);
        if(curr==c) curr = r;
        return curr+helper(s,c,r,i+1);
    }
}
