import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int[] nums = new int[n];
		int maxNum = 0;
		for (int i = 0; i < n; i++) {
			nums[i] = Integer.parseInt(br.readLine());
			maxNum = Math.max(maxNum, nums[i]);
		}

		int[][] dp = new int[maxNum+1][4];
		dp[1][1] = 1;
		dp[2][1] = 1;
		dp[2][2] = 1;
		dp[3][1] = 1;
		dp[3][2] = 1;
		dp[3][3] = 1;
		if (maxNum > 3) {
			for (int i = 4; i <= maxNum; i++) {
				dp[i][1] = dp[i-1][1]; // 1 추가되는건 1 작은 수
				dp[i][2] = dp[i-2][1] + dp[i-2][2]; // 2 추가되는건 2 작은 수
				dp[i][3] = dp[i-3][1] + dp[i-3][2] + dp[i-3][3]; // 3 추가되는건 3 작은 수
			}
		}

		for (int num : nums) {
			System.out.println(dp[num][1]+dp[num][2]+dp[num][3]);
		}
	}
}