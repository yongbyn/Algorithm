import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int X = Integer.parseInt(st.nextToken());

		int num = 1;
		int sum = 1; // X index
		int numerator; // 분자
		int denominator; // 분모

		while (sum < X) {
			num++; // 2
			sum += num; // 3
		}

		int index = sum - X+1;
		if (num % 2 == 0) {
			numerator = num - index + 1;
			denominator = index;
		} else {
			numerator = index;
			denominator = num - index + 1;
		}

		System.out.println(numerator + "/" + denominator);
	}
}