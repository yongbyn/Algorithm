import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        boolean isNum = false;

        for (int i = 0; i <N; i++) {
            int compareNum = i;
            int temp = i;
            while(compareNum > 0) {
                temp += compareNum%10;
                compareNum /= 10;
            }

            if (temp == N){
                System.out.println(i);
                isNum = true;
                break;
            }
        }
        if (!isNum) System.out.println(0);
    }
}