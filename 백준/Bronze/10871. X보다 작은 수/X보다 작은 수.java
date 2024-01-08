import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        String str = br.readLine(); // 정수 개수 부르기
        String[] Num = str.split(" "); // 배열 정리
        int N = Integer.parseInt(Num[0]); // 배열을 이루는 정수 개수
        int X = Integer.parseInt(Num[1]); // 기준 값

        str = br.readLine(); // 배열 부르기
        Num = str.split(" "); // 배열 정리
        StringBuilder cnt = new StringBuilder(); // 초기값

        for (int i=0;i<N;i++){
         if (Integer.parseInt(Num[i]) < X){
             cnt.append(Integer.parseInt(Num[i])).append(" ");
         }
        }

        System.out.println(cnt);
    }
}