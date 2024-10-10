import java.io.*;
import java.util.*;

public class Main{
	static int[] dx = {0,1,0,-1};
	static int[] dy = {1,0,-1,0};
	static boolean[][] visited;
	static int[][] square;
	static int N, M, K;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		square = new int[N][M];
		visited = new boolean[N][M];

		for (int i = 0; i < K; i++) {
			st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			for (int x = x1; x < x2; x++) {
				for (int y = y1; y < y2; y++) {
					square[x][y] = 1;
				}
			}
		}
		// 이렇게 하면 1번 사각형만 찾고 끝인데 이중 for문으로 전체 탐색?
		//        bfs(0,0);
		List<Integer> areaSizes = new ArrayList<>();

		for (int x = 0; x < N; x++) {
			for (int y = 0; y < M; y++) {
				if (square[x][y] == 0 && !visited[x][y]){
					areaSizes.add(bfs(x,y));
				}
			}
		}

		Collections.sort(areaSizes);
		System.out.println(areaSizes.size());
		for (int areaSize : areaSizes) {
			System.out.print(areaSize + " ");
		}
	}

	private static int bfs(int i, int j) {
		Queue<int[]> queue = new LinkedList<>();
		queue.offer(new int[] {i,j});
		int size = 0;

		while(!queue.isEmpty()) {
			int[] now = queue.poll();
			visited[i][j] = true;
			size++;

			for (int k = 0; k < 4; k++) {
				int x = now[0] + dx[k];
				int y = now[1] + dy[k];
				if (x >= 0 && y >= 0 && x < N && y < M
					&& square[x][y] == 0 && !visited[x][y]) {
					visited[x][y] = true;
					queue.add(new int[] {x,y});
				}
			}
		}

		return size;
	}
}