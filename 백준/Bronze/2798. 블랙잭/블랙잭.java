import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        String[] cardStr = br.readLine().split(" ");
        int[] card = new int[N];
        for (int i = 0; i < N; i++) {
            card[i] = Integer.parseInt(cardStr[i]);
        }
        int maxVal = 0;

        for (int i = 0; i < N-2; i++) {
            for (int j = i + 1; j < N-1; j++) {
                for (int k = j + 1; k < N; k++) {
                    int temp = Math.max(card[i] + card[j] + card[k], maxVal);
                    if (temp <= M) {
                        maxVal = temp;
                    }
                }
            }
        }
        System.out.println(maxVal);
    }
}
