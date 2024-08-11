import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int[] material = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        for(int i = 0; i < N; i++) {
            material[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(material);
        
        int count = 0;
        int startIdx = 0;
        int endIdx = N-1;
                
        while(startIdx < endIdx) {
            if (material[startIdx]+material[endIdx] < M) startIdx++;
            else if(material[startIdx]+material[endIdx] > M) endIdx--;
            else{
                count++;
                startIdx++;
                endIdx--;
            }
        }
        System.out.println(count);
    }
}