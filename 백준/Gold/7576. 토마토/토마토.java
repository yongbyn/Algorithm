import java.io.*;
import java.util.*;

public class Main {
	static int M,N;
	static int[][] box;
	static int[] dx = {-1,1,0,0};
	static int[] dy = {0,0,-1,1};
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());

		box = new int[N][M];
		for (int i = 0; i < N; i++){
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				box[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		int answer = bfs();

		for (int i = 0; i < N; i++){
			for (int j = 0; j < M; j++){
				if (box[i][j] == 0) {
					answer = -1;
					break;
				}
			}
		}

		System.out.println(answer);
	}

	private static int bfs() {
		Queue<int[]> queue = new LinkedList<>();

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (box[i][j] == 1) {
					queue.add(new int[] {i,j,0}); // x, y, day
				}
			}
		}

		int maxDay = 0;
		while (!queue.isEmpty()) {
			int[] now = queue.poll();

			for (int k = 0; k < 4; k++) {
				int x = now[0] + dx[k];
				int y = now[1] + dy[k];
				if (x >= 0 && y >= 0 && x < N && y < M && box[x][y] == 0) {
					box[x][y] = 1;
					queue.add(new int[] {x,y,now[2]+1});
					maxDay = Math.max(maxDay, now[2]+1);
				}
			}
		}
		return maxDay;
	}
}