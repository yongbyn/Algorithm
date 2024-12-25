import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		char[] N = st.nextToken().toCharArray();
		int B = Integer.parseInt(st.nextToken());
		int num = 0;
		int l = N.length;
		for (int i = 0; i < N.length; i++) {

			if (N[l-1 - i]>= '0' && N[l-1 -i] <= '9') { // 숫자면
				num += (N[l-1 -i] - '0') * Math.pow(B,i);
			} else { // 알파벳이면
				num += (N[l-1 -i] - 'A' + 10) * Math.pow(B,i);
			}
		}
		System.out.println(num);
	}
}