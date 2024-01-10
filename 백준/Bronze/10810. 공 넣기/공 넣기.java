import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        String[] str= br.readLine().split(" ");

        int N= Integer.parseInt(str[0]); // 바구니 수
        int M= Integer.parseInt(str[1]); // for문 횟수

        int[] arr = new int[N]; // 바구니 빈 배열
        int ind1;
        int ind2;
        int ball_num;

        for (int i=0; i<M;i++){
            str= br.readLine().split(" ");
            ind1 = Integer.parseInt(str[0])-1; // 바구니 순서 처음
            ind2 = Integer.parseInt(str[1])-1; // 바구니 순서 끝
            ball_num =  Integer.parseInt(str[2]); // 넣을 공

            for(int j=ind1;j<=ind2; j++){
                arr[j]=ball_num; // 공 넣는 값으로 계속 변경
            }
        }

        for (int i=0; i<N;i++){
            System.out.printf("%d ", arr[i]);
        }
    }
}