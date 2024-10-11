import java.io.*;
import java.util.*;

public class Main {
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int n1 = N/10;
		int n2 = N%10;
		int newNum = n2*10 + (n1 + n2) % 10;
		int count = 1;
		while (newNum != N) {
			n1 = newNum/10;
			n2 = newNum%10;

			newNum = n2*10 + (n1 + n2) % 10;
			count++;
		}
		System.out.println(count);
	}
}