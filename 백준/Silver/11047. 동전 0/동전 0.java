import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int N = Integer.parseInt(str[0]);
        int K = Integer.parseInt(str[1]);
        int[] coins = new int[N];
        for (int i = 0; i < N; i++) {
            coins[i] = Integer.parseInt(br.readLine());
        }
        
        int coinNum = 0;
        for (int i = N-1; i >= 0; i--) {
            int coin = coins[i];
            if (coin <= K) {
                coinNum += K/coin;
                K = K%coin;
            }
        }
        System.out.println(coinNum);
    }
}