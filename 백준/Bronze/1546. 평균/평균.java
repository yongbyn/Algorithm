import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        double M = 0; // 최대값 초기화

        st = new StringTokenizer(br.readLine());
        double[] score = new double[N];

        for(int i=0; i<N; i++){
            score[i]=Integer.parseInt(st.nextToken());;
            M = Math.max(score[i],M); // 최대값 정의
        }

        double[] new_score = new double[N];
        double sum = 0;
        for(int j=0; j<N; j++){
            new_score[j] = score[j]/M*100; // 새로운 점수 계산
            sum += new_score[j]; // 누적합
        }

        double aver = sum/N; // 평균
        System.out.println(aver);

    }
}