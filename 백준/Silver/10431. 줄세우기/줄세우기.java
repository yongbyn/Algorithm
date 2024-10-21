import java.util.*;
import java.io.*;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int P = Integer.parseInt(st.nextToken());
        int[][] children = new int[P][21];
        int[] count = new int[P];
        
        for (int i = 0; i < P; i++) {
            st = new StringTokenizer(br.readLine());
            children[i][0] = Integer.parseInt(st.nextToken());
            for (int j = 1; j < 21; j++) {
                children[i][j] = Integer.parseInt(st.nextToken());
                for (int k = 1; k < j; k++) {
                    if (children[i][k] > children[i][j]) {
                        count[i]++;
                    }
                }
            }
            System.out.println(i+1 + " " + count[i]);
        }
        
    }
}