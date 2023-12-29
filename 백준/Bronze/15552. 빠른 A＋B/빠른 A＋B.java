import java.io.*;
import java.nio.Buffer;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer str = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(str.nextToken());
        StringBuilder sb = new StringBuilder("");
        for (int i=0;i<T;i++){
            str = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(str.nextToken());
            int B = Integer.parseInt(str.nextToken());
            sb.append(A+B+"\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }
}
