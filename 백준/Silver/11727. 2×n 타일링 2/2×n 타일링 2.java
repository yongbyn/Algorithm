import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n =  Integer.parseInt(br.readLine());

		int[] dp = new int[n+1];

		dp[1] = 1;

		if (n > 1) {
			for (int i = 2; i < n+1; i++) {
				if (i%2 == 0) {
					dp[i] = (dp[i - 1] * 2 + 1) % 10007;
				} else {
					dp[i] = (dp[i - 1] * 2 - 1) % 10007;
				}
			}
		}

		System.out.println(dp[n]);
	}
}