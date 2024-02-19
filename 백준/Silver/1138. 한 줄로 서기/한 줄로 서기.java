import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;


public class Main{

    static int N;
    static int[] arr;
    static int[] ans;
    static boolean [] visited;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        arr = new int[N];
        ans = new int[N];
        visited = new boolean[N];

        arr = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for(int i=0 ; i<N ; i++){
            int num = arr[i]; // i번째
            int cnt = 0; // count 초기화
            for(int j = 0 ; j<N ; j++){
                if(!visited[j]){ // 방문 안하면
                    if(cnt == num){ // count와 같으면
                        visited[j] = true;
                        ans[j]=i+1; // answer에 저장 (사람은 1부터 시작이라 +1)
                        break; // j 포문 break
                    }
                    cnt++;
                }
            }
        }
        for (int an : ans){
            System.out.print(an+" ");
        }
    }
}
