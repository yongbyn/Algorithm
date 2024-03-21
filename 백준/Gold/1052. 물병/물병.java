// 1052.java
// 24.03.21. GPT 도움

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.util.Arrays.stream;


public class Main {

    static int N, K;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] input = stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        N = input[0];
        K = input[1];

        int answer = 0;

        while (true) {
            int temp = N, count = 0;
            while (temp > 0) {
                count += temp & 1; // N을 2진수로 변환했을 때 1의 개수 카운트
                temp >>= 1;
            }

            if (count <= K) break; // 1의 개수가 K 이하이면 종료

            answer++;
            N++; // 필요한 물병의 개수를 1 증가
        }

        System.out.println(answer);
    }
}