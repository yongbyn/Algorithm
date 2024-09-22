import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        HashMap<Integer, Integer> cardHM = new HashMap<>();
        for (int i = 0; i < N; i++) {
            int key = Integer.parseInt(st.nextToken());
            cardHM.put(key, cardHM.getOrDefault(key, 0) + 1);
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int j = 0; j < M; j++) {
            int key = Integer.parseInt(st.nextToken());
            sb.append(cardHM.getOrDefault(key, 0)).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}