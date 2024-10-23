import java.util.*;
import java.io.*;

public class Main {
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int[] belt = new int[2*N];

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < 2*N; i++) {
			belt[i] = Integer.parseInt(st.nextToken());
		}

		int start = 0;
		int end = N-1;
		int count = 0;
		int ans = 0;
		boolean[] isInRobot = new boolean[2*N];

		while (count < K) {
			// 컨베이어 벨트 회전
			start--;
			end--;
			start = start < 0 ? start + 2*N : start;
			end = end < 0 ? end + 2*N : end;

			// 로봇 내리기
			if (isInRobot[end]) {
				isInRobot[end] = false;
			}

			// 로봇 이동가능 확인 후 내구도 감소시키기
			for (int i = end; i != start; i = (i - 1 + 2 * N) % (2 * N)) {
				int prev = (i - 1 + 2 * N) % (2 * N);
				if (isInRobot[prev] && !isInRobot[i] && belt[i] > 0) {
					isInRobot[prev] = false;
					isInRobot[i] = true;
					belt[i]--;

					// 내구도가 0이면 count 증가
					if (belt[i] == 0) {
						count++;
					}
				}
			}

			// 로봇 내리기
			if (isInRobot[end]) {
				isInRobot[end] = false;
			}

			// 로봇 놓기
			if(belt[start] > 0 && !isInRobot[start]) {
				belt[start]--;
				isInRobot[start] = true;

				if (belt[start] == 0) {
					count++;
				}
			}


			// 단계 증가
			ans++;


		}

		System.out.println(ans);

	}
}