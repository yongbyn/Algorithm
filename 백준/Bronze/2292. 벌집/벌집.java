import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());

		int depth = 0;
		if (N==1) {
			System.out.println(1);
			return;
		}
		while (N > 1) {
			depth++;
			N = N - (depth - 1) * 6;
		}
		System.out.println(depth);
	}
}