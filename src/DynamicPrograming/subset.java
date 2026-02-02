package DynamicPrograming;

import java.util.*;
public class subset{
    public static void main(String[] args) {
        int[] arr = {7,12};
        int t = 26;
        List<List<String>> list = new ArrayList<>();
        for(int i=0;i<t+1;i++){
            List<String> l = new ArrayList<>();
            l.add("");
            list.add(l);
        }
        boolean[] dp = new boolean[t+1];
        dp[0] = true;

        int i = 0;
        while(i<t){
            if(dp[i]){
                for(int j=0;j<arr.length;j++){
                    if(i+arr[j]<dp.length){
                        dp[i+arr[j]] = true;
                        List<String> l = new ArrayList<>(list.get(i+arr[j]));
                        for(String x : list.get(i)){
                            l.add(x+" "+arr[j]);
                        }
                        list.add(i+arr[j],l);
                    }
                }
            }
            i++;
        }
        List<String> res = new ArrayList<>();
        for(String m : list.get(t)){
            m = m.trim();
            if(m.isEmpty()){
                continue;
            }
            String[] a = m.split(" ");

            int n=0;
            for (String s : a) {
                n += Integer.parseInt(s);

            }
            if(n==t) res.add(m);

        }
        System.out.println(res);
        System.out.println(list);
    }
}