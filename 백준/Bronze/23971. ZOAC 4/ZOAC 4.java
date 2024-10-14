import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] str = br.readLine().split(" ");
		int H = Integer.parseInt(str[0]);
		int W = Integer.parseInt(str[1]);
		int N = Integer.parseInt(str[2]);
		int M = Integer.parseInt(str[3]);

		int peopleH = (int)Math.ceil((double)H / (N+1));
		int peopleW = (int)Math.ceil((double)W / (M+1));

		System.out.println(peopleH*peopleW);

	}
}