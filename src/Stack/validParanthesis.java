package Stack;

import java.util.Scanner;
import java.util.Stack;

public class validParanthesis {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "({})";
        System.out.println(validPalin(s));

    }
    public static boolean validPalin(String s){
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '[' || c == '{' || c == '('){
                stack.push(c);
            }else{
                if(stack.isEmpty()){
                    return false;
                }
                char top = stack.pop();
                if(c == '(' && top != ')' || c == '[' && top != ']' || c == '{' && top != '}' ){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
