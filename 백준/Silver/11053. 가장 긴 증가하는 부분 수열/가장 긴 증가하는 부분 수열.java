import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Main{


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");

        int[] sequence = new int[N];
        int[] dp = new int[N]; // 최대 길이 저장 배열
        for (int i=0; i<N; i++){
            sequence[i] = Integer.parseInt(str[i]);
            dp[i] = 1; //최대길이 최소 1 저장
        }

        // 최대 수열 길이
        int maxLen = 0;

        // 기준 index
        for (int j=0; j<N; j++){
            // 비교 index
            for (int k=0; k<j; k++){
                // k번째가 j번째보다 작은 수면 실행
                if (sequence[k] < sequence[j]){
                    // k번째의 dp에 1추가하거나 j번째가 더 큰지 확인
                    // ex. 처음 j=2, k=1에서 증가시 dp[2]=2,
                    // 그다음 j++에서 또 j=3, k=1에서 dp[3]=2, k=2에서 또 증가하게되면 dp[3]=3
                    dp[j] = Math.max(dp[j], dp[k] + 1);
                }
            }
            maxLen = Math.max(maxLen, dp[j]);
        }

        System.out.println(maxLen);
    }
}
