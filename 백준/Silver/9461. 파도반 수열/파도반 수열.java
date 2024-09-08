import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine());
        
        long[] p = new long[101];
            
        p[0] = 1;
        p[1] = 1;
        p[2] = 1;
        for (int j = 3; j < 101; j++) {
            p[j] = p[j-2] + p[j-3];
        }
        
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            System.out.println(p[N-1]);
        }
    }
}