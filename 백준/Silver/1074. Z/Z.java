import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    static int[][] arr;
    static int N;
    static int r;
    static int c;
    static int count = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        N = Integer.parseInt(str[0]);
        r = Integer.parseInt(str[1]);
        c = Integer.parseInt(str[2]);
        int arrSize = (int) Math.pow(2, N);

        Z(0, 0, arrSize);

    }

    static void Z(int x, int y, int n) {
        // Z가 될 때
        if (n == 1) {
            // 해당하는 count 출력
            if (x == r && y == c) {
                System.out.println(count);
            }
            // 아닐시 증가
            count++;
            return;
        }

        int n2 = n / 2;
            
            // 1사분면일 경우
        if (r < x + n2 && c < y + n2) {
            // 1사분면만 재귀
            Z(x, y, n2);
            // 2사분면일 경우
        } else if (r < x + n2) {
            // 건너뛴 진행(count)만큼 추가
            count += n2 * n2;
            // 2사분면만 재귀
            Z(x, y + n2, n2);
            // 3사분면일 경우
        } else if (c < y + n2) {
            // 건너뛴 진행(1사+2사)만큼 추가
            count += 2 * n2 * n2;
            // 3사분면만 재귀
            Z(x + n2, y, n2);
            // 4사분면일 경우
        } else {
            // 건너뛴 진행(1사+2사+3사)만큼 추가
            count += 3 * n2 * n2;
            // 4사분면만 재귀
            Z(x + n2, y + n2, n2);
        }
    }
}
