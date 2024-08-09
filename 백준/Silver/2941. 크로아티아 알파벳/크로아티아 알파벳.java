import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        String[] croatiaAlphabets = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
            
        for (String alphabet : croatiaAlphabets) {
            str = str.replace(alphabet,"*");
        }
        System.out.println(str.length());
    }
}