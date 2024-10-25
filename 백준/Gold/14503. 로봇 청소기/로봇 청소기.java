import java.io.*;
import java.util.*;

public class Main {
	static int[] dx = {-1, 0, 1, 0};
	static int[] dy = {0, 1, 0, -1};
	static int[][] map;
	static boolean[][] cleaned;
	static int n,m;
	static int cleanCount = 0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		map = new int[n][m];
		cleaned = new boolean[n][m];

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

		dfs(x, y, dir);
		System.out.println(cleanCount);
	}

	public static void dfs(int x, int y, int dir) {
		// 현재 위치를 청소
		if (map[x][y] == 0) {
			cleanCount++;
			map[x][y] = -1; // 완료 표시
		}

		// 4방향을 차례대로 탐색
		for (int i = 0; i < 4; i++) {
			dir = (dir + 3) % 4; // 반시계 회전 [북 동 남 서] -> -1 or +3 해주면 됨
			int nx = x + dx[dir];
			int ny = y + dy[dir];

			// 아직 청소하지 않은 경우 + 범위 내
			if (nx >= 0 && nx < n && ny >= 0 && ny < m && map[nx][ny] == 0) {
				dfs(nx, ny, dir); // 재귀적으로 다음 위치로 이동
				return; // 청소했으니 더 이상 탐색하지 않고 리턴
			}
		}

		// 4방향 모두 청소가 되었거나 벽인 경우 후진
		int backDir = (dir + 2) % 4; // 반대는 + 2 or -2
		int bx = x + dx[backDir];
		int by = y + dy[backDir];

		// 후진할 수 있으면 후진
		if (bx >= 0 && bx < n && by >= 0 && by < m && map[bx][by] != 1) {
			dfs(bx, by, dir); // 후진한 위치에서 다시 탐색
		}
	}
}