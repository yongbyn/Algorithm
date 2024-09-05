import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        char[][] chess = new char[N][M];
        int minChange = Integer.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < M; j++) {
                chess[i][j] = line.charAt(j);
            }
        }

        for (int i = 0; i < N-7; i++) {
            for (int j = 0; j < M-7; j++) {
                int changeW = 0;
                int changeB = 0;
                for (int x = 0; x < 8; x++) {
                    for (int y = 0; y < 8; y++) {
                        if ((x+y) % 2 == 0) {
                            // 짝수 -> 시작 위치와 색이 같아야함
                            if (chess[x+i][y+j] != 'W') changeW++;
                            if (chess[x+i][y+j] != 'B') changeB++;
                        } else {
                            // 홀수 -> 시작 위치와 색이 달라야함
                            if (chess[x+i][y+j] != 'B') changeW++;
                            if (chess[x+i][y+j] != 'W') changeB++;
                        }
                    }
                }

                minChange = Math.min(minChange, Math.min(changeW,changeB));
            }
        }

        System.out.println(minChange);
    }
}