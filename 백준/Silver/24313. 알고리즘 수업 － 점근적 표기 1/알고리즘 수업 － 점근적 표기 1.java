import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a1 = Integer.parseInt(st.nextToken());
        int a0 = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(br.readLine());
        int n0 = Integer.parseInt(br.readLine());
        boolean result = false;

        if (a1 <= c && a1 * n0 + a0 <= c * n0){
            result = true;
        }

        if(result) {
            System.out.println(1);
        }else {
            System.out.println(0);
        }
    }
}
