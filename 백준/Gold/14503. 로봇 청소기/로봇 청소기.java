import java.io.*;
import java.util.*;

public class Main {
	static int[] dx = {-1, 0, 1, 0};
	static int[] dy = {0, 1, 0, -1};
	static int[][] map;
	static boolean[][] visited;
	static int n,m;
	static int cleanCount = 0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		map = new int[n][m];
		visited = new boolean[n][m];

		st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int dir = Integer.parseInt(st.nextToken());

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < m; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		bfs(x, y, dir);
		System.out.println(cleanCount);
	}

	public static void bfs(int x, int y, int dir) {
		Queue<int[]> q = new LinkedList<>();
		q.add(new int[]{x, y, dir});
		visited[x][y] = true;

		while (!q.isEmpty()) {
			int[] cur = q.poll();
			int curX = cur[0];
			int curY = cur[1];
			int curDir = cur[2];

			//현재 위치 청소
			if (map[curX][curY] == 0) {
				cleanCount++;
				map[curX][curY] = -1; // 완료 표시
			}

			boolean moved = false;
			for (int i = 0; i < 4; i++) {
				curDir = (curDir + 3) % 4; // 반시계 회전 [북 동 남 서] -> -1 or +3 해주면 됨
				int nx = curX + dx[curDir];
				int ny = curY + dy[curDir];

				// 아직 청소하지 않은 경우 + 범위 내
				if (!visited[nx][ny] && map[nx][ny] == 0 && nx >= 0 && ny >= 0 && nx < n && ny < m) {
					q.add(new int[]{nx, ny, curDir});
					visited[nx][ny] = true;
					moved = true;
					break; // 이동했으면 나머지는 탐색 X
				}
			}

			// 4방향 모두 청소되었거나 벽인 경우 후진
			if (!moved) {
				int backDir = (curDir + 2 ) % 4; // 반대는 + 2 or -2
				int bx = curX + dx[backDir];
				int by = curY + dy[backDir];

				// 후진할 수 있으면 후진
				if (bx >= 0 && bx < n && by >= 0 && by < m && map[bx][by] != 1) {
					q.add(new int[]{bx, by, curDir}); // 후진한 위치 + curDir를 큐에 넣음
				} else {
					// 후진 안되면 종료
					return;
				}
			}
		}
	}
}