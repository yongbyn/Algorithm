import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());

		StringBuilder sb = new StringBuilder();

		while (N > 0) {
			int remainder = N % B;
			// 0-9는 그대로 숫자로, 10 이상은 A-Z로 변환
			if (remainder < 10) {
				sb.append((char) (remainder + '0'));
			} else {
				sb.append((char) (remainder - 10 + 'A'));
			}
			N /= B;
		}

		// 결과를 뒤집어서 출력
		System.out.println(sb.reverse().toString());
	}
}