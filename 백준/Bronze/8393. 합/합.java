import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(str.nextToken());
        int Sum=0;
        while (N>0){
            Sum = Sum + N;
            N--;
        }

        System.out.println(Sum);
    }
}
