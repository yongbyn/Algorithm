import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] stair = new int[n];
        int[] dp = new int[n];
        for (int i = 0; i < n; i++) {
            stair[i] = Integer.parseInt(br.readLine());
        }
        dp[0] = stair[0];
        if (n >= 2) {
            dp[1] = stair[0] + stair[1];
        }
        if (n >= 3) {
            dp[2] = Math.max(stair[1] + stair[2], stair[0] + stair[2]);
            for (int i = 3; i < n; i++) {
                dp[i] = Math.max(dp[i - 2] + stair[i], dp[i - 3] + stair[i - 1] + stair[i]);
            }
        }

        System.out.println(dp[n - 1]);
    }
}