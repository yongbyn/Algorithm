import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");

        int N = Integer.parseInt(str[0]);
        int[] doll = new int[N];
        int K = Integer.parseInt(str[1]);
        ArrayList<Integer> lion = new ArrayList<Integer>();

        str = br.readLine().split(" ");
        for(int i=0;i<N;i++){
            doll[i]=Integer.parseInt(str[i]);
            if (doll[i] == 1){
                lion.add(i);
            }
        }

        if (lion.size() < K){
            System.out.println("-1");
            return;
        }
        int start = 0;
        int end = K-1;
        int count = 0;
        int min= Integer.MAX_VALUE;
        while(true){
            if(end==lion.size()) break;
            count = lion.get(end) - lion.get(start)+1;
            min = count < min ? count : min;

            start++;
            end++;
        }
        System.out.println(min);
    }
}