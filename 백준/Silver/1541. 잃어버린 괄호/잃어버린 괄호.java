import java.io.*;
import java.util.*;

public class Main{
    static int answer = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] str = br.readLine().split("-");
        for(int i = 0; i < str.length; i++) {
            int temp =  mySum(str[i]);
            if (i==0) answer += temp;
            else answer -= temp;
        }
        System.out.println(answer);
    }
    private static int mySum(String a) {
        int sum = 0;
        String[] temp = a.split("[+]");
        for (int i = 0; i < temp.length; i++) {
            sum += Integer.parseInt(temp[i]);
        }
        return sum;
    }
}