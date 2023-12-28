import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());

        int Num_N = Integer.parseInt(str.nextToken());
        int Sum_N = Integer.parseInt(str.nextToken());

        str = new StringTokenizer(br.readLine());
        int[] Cum_Sum = new int[Num_N];
        Cum_Sum[0] = Integer.parseInt(str.nextToken());
        for (int i=1; i< Num_N; i++) {
            Cum_Sum[i] = Cum_Sum[i-1] + Integer.parseInt(str.nextToken());
        }

        int[] Result_Sum = new int[Sum_N];
        for (int j=0;j<Sum_N;j++){
            str = new StringTokenizer(br.readLine());
            int ind_1 = Integer.parseInt(str.nextToken())-1;
            int ind_2 = Integer.parseInt(str.nextToken())-1;
            if (ind_1 == 0) {
                Result_Sum[j] = Cum_Sum[ind_2];
            }else{
                Result_Sum[j] = Cum_Sum[ind_2]-Cum_Sum[ind_1-1];
            }
            System.out.println(Result_Sum[j]);
        }

    }
}