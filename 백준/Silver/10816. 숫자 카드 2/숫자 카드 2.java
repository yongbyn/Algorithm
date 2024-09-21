import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // 숫자 카드를 저장할 HashMap
        HashMap<Integer, Integer> cardMap = new HashMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 가지고 있는 카드의 개수를 카운팅하여 HashMap에 저장
        for (int i = 0; i < N; i++) {
            int card = Integer.parseInt(st.nextToken());
            // 있으면 있는 개수에 +1, 없으면 0+1
            cardMap.put(card, cardMap.getOrDefault(card, 0) + 1);
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        // 찾으려는 카드가 있으면 그 개수를, 없으면 0을 출력
        for (int j = 0; j < M; j++) {
            int sample = Integer.parseInt(st.nextToken());
            sb.append(cardMap.getOrDefault(sample, 0)).append(" ");
        }

        // 결과 출력
        System.out.println(sb.toString().trim());
    }
}
