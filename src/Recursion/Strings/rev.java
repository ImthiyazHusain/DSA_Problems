package Recursion.Strings;

import java.util.Scanner;

public class rev {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s=reverse(s);
        System.out.println(s);
    }
    public static String reverse(String s){
        if(s.isEmpty()) return s;
        return helper(s,0);
    }
    public static String helper(String s,int i){
        if(i==s.length()){
            return "";
        }
        return helper(s,i+1)+(s.charAt(i));
    }
}
