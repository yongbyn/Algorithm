import java.io.*;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());

        int StarNum = Integer.parseInt(str.nextToken());
        int Linespace;
        int Linestar;
        for (int i=0; i<StarNum;i++){
            Linespace =StarNum-i-1;
            while( Linespace>0 ){
            System.out.print(" ");
                Linespace--;
            }
            Linestar =0;
            while( Linestar<=i ){
                System.out.print("*");
                Linestar++;
            }
            System.out.println("");
        }
    }
}