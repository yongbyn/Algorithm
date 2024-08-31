import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        long n = Long.parseLong(br.readLine());
        long result = 0;
        
        while(n>0) {
            n--;
            result += n;
        }
        
        System.out.println(result);
        System.out.println(2);
    }
}