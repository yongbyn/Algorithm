import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;


public class Main{

    static String[] str;
    static int N;
    static int M;
    static int R;
    static boolean[] visited;
    static int[] visitOrder; // 방문 순서
    static int visitOrderCount = 1; // 방문 순서
    static ArrayList<Integer>[] adjNode;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        str = br.readLine().split(" ");
        N = Integer.parseInt(str[0]) ;
        M = Integer.parseInt(str[1]) ;
        R = Integer.parseInt(str[2]) ;

        // index 1부터 시작 => N+1까지 생성
        visited = new boolean[N+1];
        adjNode = new ArrayList[N+1];
        visitOrder = new int[N+1];

        for (int i=1; i<N+1; i++){
            adjNode[i] = new ArrayList<>(); // 각 정점마다 리스트 생성
        }

        for (int i=0; i<M;i++){
            str = br.readLine().split(" ");
            int a = Integer.parseInt(str[0]);
            int b = Integer.parseInt(str[1]);

            adjNode[a].add(b);
            adjNode[b].add(a);
        }

        // 오름차순 정렬
        for (int i=1; i<N+1; i++){
            Collections.sort(adjNode[i]);
        }

        dfs(R);

        for (int k=1 ; k<N+1;k++) {
            sb.append(visitOrder[k] + "\n");
        }
        System.out.println(sb);
    }

    private static void dfs(int r) {

        // 방문 check
        visited[r] = true;

        // 방문 order 저장
        visitOrder[r] = visitOrderCount++;

        for (int i : adjNode[r]) { // 인접한 노드들이
            if (!visited[i]){       // 방문 했는지 확인
                dfs(i);              // 후 재귀
            }
        }
    }
}