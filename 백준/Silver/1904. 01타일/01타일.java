import java.io.*;
import java.util.*;

public class Main {

    static int[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        dp = new int[N + 1];

        dp[1] = 1;
        if (N >= 2) dp[2] = 2;

        if (N >= 3) {
            for (int i = 3; i <= N; i++) {
                dp[i] = (dp[i - 1] + dp[i - 2])%15746;
            }
        }
        int result = dp[N];

        System.out.println(result);
    }

}