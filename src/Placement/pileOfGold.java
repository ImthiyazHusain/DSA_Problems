package Placement;

import java.util.Scanner;

public class pileOfGold {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] piles = new int[n];

        int max = 0;
        for (int i = 0; i < n; i++) {
            piles[i] = sc.nextInt();
            max = Math.max(max, piles[i]);
        }

        int H = sc.nextInt();

        int low = 1, high = max;
        int ans = max;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            int hours = hoursNeeded(mid, piles);

            if (hours <= H) {
                ans = mid;          // possible answer
                high = mid - 1;     // try slower speed
            } else {
                low = mid + 1;      // need faster speed
            }
        }

        System.out.println(ans);
    }

    static int hoursNeeded(int k, int[] piles) {
        int hours = 0;
        for (int p : piles) {
            hours += (p + k - 1) / k;   // ceil division
        }
        return hours;
    }
}
