import java.io.*;

public class Main {

    static int count1 = 0;
    static int count2 = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int result1 = fib1(N);
        int result2 = fib2(N);

        System.out.println(count1 + " " + count2);
    }

    public static int fib1(int n) {
        if (n == 1 || n == 2) {
            count1++;
            return 1;
        } else {
            return fib1(n - 1) + fib1(n - 2);
        }
    }
    public static int fib2(int n) {
        int[] f = new int[n];
        f[0] = 1; f[1] = 1;
        for (int i = 2; i < n; i++) {
            count2++;
            f[i] = f[i - 1] + f[i - 2];
        }
        return f[n-1];
    }
}