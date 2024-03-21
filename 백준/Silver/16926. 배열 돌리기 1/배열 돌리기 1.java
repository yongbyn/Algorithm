// 15654.java
// 24.03.21. 18:00 ~ 18:59 GPT 도움 테두리 완성
// 24.03.22 00:07 내부 완성 

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {

    static int N,M,R;
    static int[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());

        arr = new int[N][M];
        for (int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<M; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        rotateArray();

        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void rotateArray(){
        // Rth rotate
        for (int rotate = 0; rotate < R; rotate++){
            int layer = 0;
            while(layer<N/2 && layer<M/2) {
                int startRow = layer;
                int startCol = layer;
                int endRow = N-1-layer;
                int endCol = M-1-layer;

                int temp = arr[startRow][startCol]; // 첫 원소

                // 위
                for (int j = startCol; j < endCol; j++) {
                    arr[startRow][j] = arr[startRow][j + 1];
                }
                // 오른쪽
                for (int i = startRow; i < endRow; i++) {
                    arr[i][endCol] = arr[i + 1][endCol];
                }
                // 아래
                for (int j = endCol; j > startCol; j--) {
                    arr[endRow][j] = arr[endRow][j - 1];
                }
                // 왼쪽
                for (int i = endRow; i > startRow; i--) {
                    arr[i][startCol] = arr[i - 1][startCol];
                }
                arr[startRow + 1][startCol] = temp; // 첫 원소 저장

                layer++; // 안쪽으로 이동
            }
        }
    }
}