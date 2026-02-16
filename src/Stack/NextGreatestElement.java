package Stack;

import java.util.*;

public class NextGreatestElement {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(Arrays.toString(NGE(new int[] {12,39,62,1,9,32})));
    }
    public static int[] NGE(int[] nums){
        int n = nums.length;
        int[] ans = new int[n];
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && nums[i]>nums[stack.peek()]){
                int t = stack.pop();
                ans[t] = nums[i];
            }
            if(stack.isEmpty()){
                ans[i] = -1;
            }
            stack.push(i);
        }
        return ans;
    }
}
