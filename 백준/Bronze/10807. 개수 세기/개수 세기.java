import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        String str = br.readLine(); // 정수 개수 부르기
        int N = Integer.parseInt(str); // 정수 개수

        str = br.readLine(); // 배열 부르기
        String[] Num = str.split(" "); // 배열 정리
        int cnt = 0, i = 0; // 초기값

        String str2 = br.readLine(); // 찾을 정수 부르기
        int findNum = Integer.parseInt(str2); // 찾을 정수

        while( N > 0 ){
            int A = Integer.parseInt(Num[i]);
            if (A==findNum) {
                cnt++;
            }
            N--;
            i++;
        }

        System.out.println(cnt);
    }
}