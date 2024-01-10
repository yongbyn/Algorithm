import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[9]; // 길이 9 빈 배열

        for(int i=0; i<9; i++){
            arr[i] =Integer.parseInt(br.readLine()); // 한 줄(한 개)씩 부르면서 int로 변환하여 빈 배열에 넣기
        }

        int Val_max = 0; // 최대값 초기화
        int ind_max = 1; // 최대값인덱스 초기화

        for (int i=0; i<9; i++){
            if (Val_max < arr[i]){
                Val_max = arr[i];
                ind_max = i+1;
            }
        }

        System.out.println(Val_max);
        System.out.println(ind_max);
    }
}
