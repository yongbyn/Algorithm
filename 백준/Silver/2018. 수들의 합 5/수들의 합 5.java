import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 1;
        int startIdx = 1;
        int endIdx = 1;
        int sum = 1;
        
        while(endIdx != N) {
            if (sum == N) {
                count++;
                endIdx++;
                sum = sum + endIdx;
            }
            else if (sum > N) {
                sum = sum - startIdx;
                startIdx++;
            }else {
                endIdx++;
                sum = sum + endIdx;
            }
        }
        System.out.println(count);
    }
}