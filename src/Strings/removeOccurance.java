package Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class removeOccurance {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Character,Integer> map = new HashMap<>();
        int k = 3;
        String s = "aaabbbacd";
        int i = 0;
        while(i<s.length()){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
            i++;
        }
        StringBuilder sb = new StringBuilder();
        for(Map.Entry<Character,Integer> e : map.entrySet()){
            if(e.getValue()%k!=0){
                sb.append(e.getKey());
            }
        }
        System.out.println(sb);
    }
}
