import java.io.*;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());

        int CaseNum = Integer.parseInt(str.nextToken());
        StringBuilder sb = new StringBuilder("");

        for (int i=0; i<CaseNum;i++){
            str = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(str.nextToken());
            int B = Integer.parseInt(str.nextToken());
            sb.append("Case #"+(i+1)+": "+A+" + "+B+" = "+ (A+B)+"\n");
        }
        System.out.println(sb.toString());
    }
}