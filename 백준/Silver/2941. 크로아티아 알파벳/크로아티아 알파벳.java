import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int length = str.length();
        
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '-') length--;
            else if (str.charAt(i) == 'j' && i >= 1) {
                if (str.charAt(i-1) == 'l' || str.charAt(i-1) == 'n') length--;
            }
            else if(str.charAt(i) == '=' && i >= 1) {
                if (str.charAt(i-1) == 'c' || str.charAt(i-1) == 's' || str.charAt(i-1) == 'z') length--;
                if (i>=2) {
                    if (str.charAt(i-2)== 'd' &&  str.charAt(i-1) == 'z') length--;
                }
            }
        }
        System.out.println(length);
    }
}