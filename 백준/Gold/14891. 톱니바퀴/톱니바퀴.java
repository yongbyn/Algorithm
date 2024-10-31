import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[][] gear = new int[4][8];

		for (int i = 0; i < 4; i++) {
			String[] str = br.readLine().split("");
			for (int j = 0; j < 8; j++) {
				gear[i][j] = Integer.parseInt(str[j]);
			}
		}

		int k = Integer.parseInt(br.readLine());

		for (int i = 0; i < k; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int num = Integer.parseInt(st.nextToken()) - 1; // 0 1 2 3
			int dir = Integer.parseInt(st.nextToken());

			int[] rotation = new int[4];
			rotation[num] = dir;

			// 왼쪽 톱니
			for (int j = num - 1; j >= 0; j--) {
				if (gear[j][2] != gear[j+1][6]) {
					rotation[j] = rotation[j+1] * -1;
				} else {
					break;
				}
			}

			// 오른쪽 톱니
			for (int j = num + 1; j < 4; j++) {
				if (gear[j-1][2] != gear[j][6]) {
					rotation[j] = rotation[j-1] * -1;
				} else {
					break;
				}
			}

			for (int j = 0; j < 4; j++) {
				rotateGear(gear[j], rotation[j]);
			}

		}
		int score = 0;
		for (int i = 0; i < 4; i++) {
			score += (int) (gear[i][0] * Math.pow(2,i));
		}

		System.out.println(score);
	}

	private static void rotateGear(int[] g, int dir) {
		if (dir == 1) { // 시계 방향
			int temp = g[7];
			for (int i = 7; i > 0; i--) {
				g[i] = g[i-1];
			}
			g[0] = temp;
		} else if (dir == -1){ // 반시계 방향
			int temp = g[0];
			for (int i = 0; i < 7; i++) {
				g[i] = g[i+1];
			}
			g[7] = temp;
		}
	}
}