import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        boolean[][] doHwaJi = new boolean[100][100];
        int coveredArea = 0;

        for (int k = 0; k < n; k++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            for (int i = x; i < x + 10; i++) {
                for (int j = y; j < y + 10; j++) {
                    if (!doHwaJi[i][j]) {
                        doHwaJi[i][j] = true;
                        coveredArea++;
                    }
                }
            }
        }
        
        System.out.println(coveredArea);
    }
}