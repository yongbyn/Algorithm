import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int maxValue = 0;
        int row = -1;
        int column = -1;
        for (int i = 0; i < 9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++) {
                int temp = Integer.parseInt(st.nextToken());
                if (temp >= maxValue) {
                    maxValue = temp;
                    row = i+1;
                    column = j+1;
                }
            }
        }
        System.out.print(maxValue + "\n" + row + " " + column);
    }
}