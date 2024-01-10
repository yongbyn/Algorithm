import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        String[] str= br.readLine().split(" ");

        int N= Integer.parseInt(str[0]); // 바구니 수
        int M= Integer.parseInt(str[1]); // for문 횟수

        int[] arr = new int[N]; // 바구니 빈 배열
        for (int i=0;i<N;i++){
            arr[i] =i+1;
        }

        int basket1; // 첫번째바구니
        int basket2; // 두번쨰바구니
        int temp; // 임시저장값

        for (int i=0; i<M;i++) {
            str = br.readLine().split(" ");
            basket1 = Integer.parseInt(str[0]) - 1;
            basket2 = Integer.parseInt(str[1]) - 1;
            temp = arr[basket1];
            arr[basket1] = arr[basket2];
            arr[basket2] = temp;
        }

        for (int i=0; i<N;i++){
            System.out.printf("%d ", arr[i]);
        }
    }
}