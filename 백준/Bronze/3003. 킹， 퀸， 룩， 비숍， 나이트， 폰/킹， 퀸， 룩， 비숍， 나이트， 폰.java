import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int k = 1 - Integer.parseInt(st.nextToken());
        int q = 1 - Integer.parseInt(st.nextToken());
        int l = 2 - Integer.parseInt(st.nextToken());
        int bs = 2 - Integer.parseInt(st.nextToken());
        int kn = 2 - Integer.parseInt(st.nextToken());
        int p = 8 - Integer.parseInt(st.nextToken());
        
        System.out.println(k + " " + q + " " + l + " " + bs + " " + kn + " " + p);
    }
}