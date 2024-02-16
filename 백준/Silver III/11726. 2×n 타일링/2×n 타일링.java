import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;


public class Main{

    static int n;

    static int[] dp;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        dp = new int[n+1];

        dp[0] = 1;
        dp[1] = 1;
        

            for (int i=2; i<n+1;i++){
                dp[i] = (dp[i-1]+dp[i-2]) % 10007;
            }

        System.out.println(dp[n]);
    }
}