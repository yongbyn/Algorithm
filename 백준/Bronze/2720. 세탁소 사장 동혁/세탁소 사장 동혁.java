import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken());
		int C;

		int remain;
		for (int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine());
			C = Integer.parseInt(st.nextToken());
			int quarter = C / 25;
			remain = C % 25;
			int dime = remain / 10;
			remain = remain % 10;
			int nickel = remain / 5;
			remain = remain % 5;
			int penny = remain;
			System.out.println(quarter + " " + dime + " " + nickel + " " + penny);
		}
	}
}