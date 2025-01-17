import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());
		int count = 0;

		for (int i = 0; i < N; i++) {
			int number = Integer.parseInt(st.nextToken());

			if (number == 1) continue;
			boolean isPrime = true;

			for (int j = 2; j * j <= number; j++) {
				if (number % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				count++;
			}
		}

		System.out.println(count);
	}
}