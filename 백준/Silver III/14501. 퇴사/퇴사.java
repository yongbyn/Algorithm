import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main{

    static int N;

    static int[] T;
    static int[] P;
    static int[] TP;
    static String[] str;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        T = new int[N];
        P = new int[N];
        TP = new int[N+1];

        for (int i=0; i<N;i++){
            str = br.readLine().split(" ");
            T[i]= Integer.parseInt(str[0]);
            P[i]= Integer.parseInt(str[1]);
        }



        for (int j=0;j<N;j++){
            // 상담 끝나는 날 계산
            int end = j+T[j];

            // 끝나는 날이 총 일수 N일 보다 크지 않으면
            if (end < N+1) {
                // 상담을 할 경우와 안할 경우 최대값 비교
                TP[end] = Math.max(TP[j] + P[j], TP[end]);
            }
            // 상담 안 할 경우
            TP[j + 1] = Math.max(TP[j + 1], TP[j]);
        }

        
        System.out.println(TP[N]);
    }
}