import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Stream;


public class Main{

    static int N;
    static int[] requestBudget;
    static int M;
    static long left;
    static long right;
    static long finalBudget;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        requestBudget = new int[N];
        requestBudget = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(requestBudget);

        left = 0; right = requestBudget[N-1]; // 최소, 최대

        M = Integer.parseInt(br.readLine());

        while (left <= right){ // 바뀌기 전까지
            long mid = (left + right) / 2; // 평균 세금
            long sum = 0; // 세금 합
            for (int j=0;j<N;j++){
                if (requestBudget[j] >= mid){ // 평균세금 낼 수 있으면
                    sum += mid; // 평균 세금만큼 더함
                }else{
                    sum += requestBudget[j]; // 평균 세금 못내면 가능한 만큼만 더함
                }
            }
            if (sum > M){ // 내라는 세금보다 많으면
                right = mid -1; // 최대값을 줄여서 평균 세금을 줄임
            }else{
                left = mid + 1; // 아니면 최소값을 올려서 평균 세금을 올림
                finalBudget = Math.max(finalBudget, mid); // 최종 세금
            }
        }
        System.out.println(finalBudget);
    }
}
