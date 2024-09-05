import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int bag3 = 3;
        int bag5 = 5;
        int minCount = Integer.MAX_VALUE;
        int minPlayCount3 = N/3;
        int minPlayCount5 = N/5;

        for (int  i = 0; i <= minPlayCount3; i++) {
            for ( int j = 0; j <= minPlayCount5; j++) {
                if ((bag3 * i + bag5 * j) == N) {
                    minCount = Math.min(minCount,i+j);
                }
            }
        }

        if (minCount == Integer.MAX_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(minCount);
        }

    }
}