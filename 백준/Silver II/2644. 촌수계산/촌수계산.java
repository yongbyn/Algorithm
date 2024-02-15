import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;


public class Main{

    static String[] str;
    static int n;
    static int m;
    static int people1, people2;
    static boolean[] visited;
    static int[] chonSu; // 촌수 저장
    static ArrayList<Integer>[] adjNode;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        str = br.readLine().split(" ");
        people1 = Integer.parseInt(str[0]);
        people2 = Integer.parseInt(str[1]);
        m = Integer.parseInt(br.readLine());

        // index 1부터 시작 => N+1까지 생성
        visited = new boolean[n+1];
        adjNode = new ArrayList[n+1];
        chonSu = new int[n+1];

        for (int i=1; i<n+1; i++){
            adjNode[i] = new ArrayList<>(); // 각 정점마다 리스트 생성
        }

        for (int i=0; i<m;i++){
            str = br.readLine().split(" ");
            int a = Integer.parseInt(str[0]);
            int b = Integer.parseInt(str[1]);

            adjNode[a].add(b);
            adjNode[b].add(a);
        }

        // 오름차순 정렬
        for (int i=1; i<n+1; i++){
            Collections.sort(adjNode[i]);
        }

        dfs(people1, 0);

        // people2의 촌수 출력 , 방문 안했으면 순서가 0이므로 -1 출력
        System.out.println(chonSu[people2] != 0 ? chonSu[people2] : -1);

    }

    private static void dfs(int r, int chonSuCount) {

        // 방문 check
        visited[r] = true;

        // 촌ㅜ 저장
        chonSu[r] = chonSuCount;

        for (int i : adjNode[r]) { // 인접한 노드들이
            if (!visited[i]){       // 방문 했는지 확인
                dfs(i, chonSuCount+1);              // 후 재귀
            }
        }
    }
}