package Strings;

import java.util.Scanner;

public class longestPrefix {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = {"flight", "fligow", "fli"};
        String common = arr[0];
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<arr[0].length();i++){
            int flg = 0;
            for(int j=0;j<arr.length;j++){
                if(i>=arr[j].length()){
                    flg = 1;
                    break;
                }
                if(arr[0].charAt(i)==arr[j].charAt(i) && j==arr.length-1){
                    sb.append(arr[0].charAt(i));
                }else if(arr[0].charAt(i)==arr[j].charAt(i)){
                    continue;
                }else{
                    flg = 1;
                    break;
                }
            }
            if(flg == 1) break;
        }
        System.out.println(sb);
    }
}
