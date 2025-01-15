import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		int index = 0;
		boolean isDivisor = false;
		
		for (int i = 1; i <= N; i++) {
			if ( N % i == 0 ) {
				index++;
			}
			if (K == index) {
				System.out.println(i);
				isDivisor = true;
				break;
			}
		}

		if (!isDivisor) {
			System.out.println("0");
		}
	}
}