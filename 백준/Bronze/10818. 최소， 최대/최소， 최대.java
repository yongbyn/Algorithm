import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        String str = br.readLine(); // 정수 개수 부르기
        int N = Integer.parseInt(str);

        str = br.readLine(); // 배열 부르기
        String[] Num = str.split(" "); // 배열 정리
        int Val_max = Integer.MIN_VALUE;
        int Val_min = Integer.MAX_VALUE;

        for(int i=0; i<N; i++) {

            int X = Integer.parseInt(Num[i]); // 기준 값
            Val_max = Math.max(X, Val_max);
            Val_min = Math.min(X, Val_min);

        }
        System.out.println(Val_min + " " + Val_max);
    }
}
