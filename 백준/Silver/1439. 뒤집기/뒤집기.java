import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] S = br.readLine().toCharArray();
        int oneCnt = 0;
        int zeroCnt = 0;
        char current = S[0];

        if (current == '0') zeroCnt++;
        else if (current == '1') oneCnt++;

        for (int i = 1; i < S.length; i++) {
            if (S[i] != current) {
                current = S[i];
                if (S[i] == '0') zeroCnt++;
                else oneCnt++;
            }
        }

        System.out.println(Math.min(zeroCnt, oneCnt));
    }
}