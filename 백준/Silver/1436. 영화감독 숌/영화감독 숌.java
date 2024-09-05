import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int number = 666;
        int count = 0;
        
        while(count < N) {
            if (String.valueOf(number).contains("666")) count++;
            number++;
        }

        System.out.println(number-1);
    }
}