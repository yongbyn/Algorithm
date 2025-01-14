import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int X = Integer.parseInt(st.nextToken());
		int Y = Integer.parseInt(st.nextToken());

		while(true) {
			if (X == 0 && Y == 0) {
				break;
			}
			if (Y % X == 0) {
				System.out.println("factor");
			} else if (X % Y == 0) {
				System.out.println("multiple");
			} else {
				System.out.println("neither");
			}

			st = new StringTokenizer(br.readLine());
			X = Integer.parseInt(st.nextToken());
			Y = Integer.parseInt(st.nextToken());
		}
	}
}