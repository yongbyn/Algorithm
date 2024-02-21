import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int ans = N; // 기본 99

        // 1000이 등차수열이 아니므로 999와 출력값이 동일
        if (N==1000) N=999;

        //세자리 수만 등차수열 확인
        if (N>=100){
            int cnt = 0;
            for(int i=100;i<N+1;i++){
                int baek = i/100;
                int il = i%10;
                int sib = (i%100)/10;

                // 등차수열 확인 후 count 증가
                if (baek+il == sib * 2 ) cnt++;
            }
            ans = 99 + cnt;
        }

        System.out.println(ans);
    }
}
