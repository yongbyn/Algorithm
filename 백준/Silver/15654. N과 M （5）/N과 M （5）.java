// 15654.java
// 24.03.21. 12:23 ~ 13:38 GPT 힌트

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {

    static int N,M;
    static int[] arr;
    static int[] output;
    static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N];
        output = new int[M];
        visited = new boolean[N];

        st = new StringTokenizer(br.readLine());
        for (int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr); // 오름차순 정렬
        dfs(0);
    }
    public static void dfs(int depth) {
        if (depth == M) {
            for (int op : output) {
                System.out.print(op+ " ");
            }
            System.out.println();
            return;
        }
        for (int i=0; i<N; i++){
            if(!visited[i]){
                visited[i] = true;
                output[depth] = arr[i];
                dfs(depth+1);
                visited[i]= false;
            }
        }
    }
}