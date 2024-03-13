import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class Main{

    static int max = 0; // 최대값
    static int N; //
    static int[] AN; // A(N)
    static int[] combinationAn; // 계산할 배열
    static boolean[] visited; // permuation위한 확인 배열
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         N = Integer.parseInt(br.readLine());
        AN = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        combinationAn = new int[N];
        visited = new boolean[N];

        permutation(0);
        System.out.println(max);
    }

    public static void permutation(int depth) {
        if (depth == N){
            max = Math.max(max, calculateArray());
            return;
        }
        for (int i=0; i<N; i++){
            // permutation loop
            if (!visited[i]){
                visited[i] = true;
                combinationAn[depth] = AN[i];
                permutation(depth+1);
                visited[i] = false;
            }
        }
    }

    public static int calculateArray() {
        int sum = 0;
        for (int i=0; i<N-1; i++){
            sum += Math.abs(combinationAn[i]-combinationAn[i+1]);
        }
        return sum;
    }
}
