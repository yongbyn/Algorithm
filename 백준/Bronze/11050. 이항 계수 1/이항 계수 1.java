import java.util.*;
import java.io.*;

public class Main{
    static int N, K;
    static int D[][];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = (br.readLine()).split(" ");
        N = Integer.parseInt(str[0]);
        K = Integer.parseInt(str[1]);
        D = new int[N+1][N+1];
        
        // 초기화 
        for (int i = 0; i<=N; i++) {
            D[i][i] = 1;
            D[i][0] = 1;
            D[i][1] = i;
        }
        
        // 점화식 nCr = n-1Cr + n-1Cr-1
        for (int i = 2; i<=N; i++) {
            for (int j = 1; j < i; j++) {
                D[i][j] = D[i-1][j] + D[i-1][j-1];
            }
        }
        System.out.println(D[N][K]);
    }
}