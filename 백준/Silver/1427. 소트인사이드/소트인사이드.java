import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String st = br.readLine();
        int len = st.length();
        int A[] = new int[len];
        
        for (int i = 0; i < len; i++) {
            A[i] = Integer.parseInt(st.substring(i,i+1));
        }
        
        for (int i = 0; i < len; i++) {
            int max = i;
            for (int j = i+1; j < len; j++) {
                if (A[j]>A[max]) {
                    max = j;
                }
                if(A[i] < A[max]) {
                    int temp = A[i];
                    A[i] = A[max];
                    A[max] = temp;
                }
            }
        }
        for(int i = 0; i < len; i++) {
            System.out.print(A[i]);
        }
    }
}