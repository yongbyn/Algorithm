import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A);
        
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            boolean find = false;
            int target = Integer.parseInt(st.nextToken());
            int start = 0;
            int end = A.length - 1;
            while (start <= end) {
                int mid_index = (start+end)/2;
                int mid_value = A[mid_index];
                
                if (mid_value > target) {
                    end = mid_index - 1;
                } else if (mid_value < target) {
                    start = mid_index + 1;
                } else {
                    find = true;
                    break;
                }
            }
            if (find) System.out.println(1);
            else System.out.println(0);
        }
    }
}