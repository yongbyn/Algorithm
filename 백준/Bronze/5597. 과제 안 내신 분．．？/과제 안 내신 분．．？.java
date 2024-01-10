import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));



        int[] arr = new int[30]; // 학생명단
        int num=1;
        for (int i=0; i<arr.length;i++){
            arr[i] = i+1;
        }
        int N;

        for (int j=0;j<arr.length-2 ;j++) {
            N = Integer.parseInt(br.readLine()); // 바구니 수
            arr[N-1] = -1;
        }

        int[] Unsubmit = new int[2];
        for (int k=0;k<arr.length;k++){
            if(arr[k] != -1){
                if (Unsubmit[0] == 0){
                    Unsubmit[0] =arr[k];
                }else{
                    Unsubmit[1] =arr[k];
                }
            }
        }
        System.out.println(Unsubmit[0]);
        System.out.println(Unsubmit[1]);
    }
}