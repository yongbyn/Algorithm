import java.util.*;
import java.io.*;

public class Main {
	static int[] dx = {1, -1, 0, 0};
	static int[] dy = {0, 0, -1, 1};
	static int[][] map;
	static boolean[][] visited;
	static int n,m;
	static int[] start = new int[2];
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		visited = new boolean[n][m];
		map = new int[n][m];

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < m; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
				if (map[i][j] == 2) { // 시작지점 확인
					start[0] = i;
					start[1] = j;
					map[i][j] = 0;
				}
			}
		}

		bfs(start[0],start[1]);

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}

	}

	private static void bfs(int x, int y) {
		Queue<int[]> q = new LinkedList<>();
		q.add(new int[]{x, y, 0});
		visited[x][y] = true;

		while (!q.isEmpty()) {
			int[] poll = q.poll();
			for (int i = 0; i < 4; i++) {
				int nx = poll[0] + dx[i];
				int ny = poll[1] + dy[i];
				if (nx >= 0 && ny >= 0 && nx < n && ny < m && !visited[nx][ny] && map[nx][ny] != 0) {
					visited[nx][ny] = true;
					q.add(new int[]{nx, ny, poll[2]+1}); // 거리 증가
					map[nx][ny] = poll[2]+1; // 증가된 거리로 지도 수정
				}
			}
		}
		
		// 도달 못한 벽 -1 처리
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (map[i][j] == 1 & !visited[i][j]) {
					map[i][j] = -1;
				}
			}
		}

	}
}