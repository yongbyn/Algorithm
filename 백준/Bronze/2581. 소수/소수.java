import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());

		int minVal = Integer.MAX_VALUE;
		int sum = 0;
		for (int i = M; i <= N; i++) {

			boolean isPrime = true;

			if (i == 1) {
				isPrime = false;
			}

			for (int j = 2; j * j <= i; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}

			if(isPrime) {
				minVal = Math.min(minVal,i);
				sum += i;
			}
		}
		if (sum == 0) {
			System.out.println(-1);
		} else {
			System.out.println(sum);
			System.out.println(minVal);
		}
	}
}