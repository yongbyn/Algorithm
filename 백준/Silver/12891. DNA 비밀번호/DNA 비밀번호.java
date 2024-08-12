import java.io.*;
import java.util.*;

public class Main {

    static int[] myACGT;
    static int[] checkACGT;
    static int checkSecret;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int S = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        String DNAStr = br.readLine();
        char[] DNA = DNAStr.toCharArray();

        int Result = 0;
        checkACGT = new int[4];
        myACGT = new int[4];
        checkSecret = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            checkACGT[i] = Integer.parseInt(st.nextToken());
            if(checkACGT[i] == 0) {
                checkSecret++;
            }
        }

        for (int i = 0; i < P; i++) {
            Add(DNA[i]);
        }

        if (checkSecret == 4) Result++;

        for (int i = P; i < S; i++) {
            int j = i-P;
            Add(DNA[i]);
            Remove(DNA[j]);
            if (checkSecret == 4) Result++;
        }
        System.out.println(Result);
        br.close();
    }

    private static void Add(char c) {
        switch (c) {
            case 'A':
                myACGT[0]++;
                if(myACGT[0] == checkACGT[0]) checkSecret++;
                break;
            case 'C':
                myACGT[1]++;
                if(myACGT[1] == checkACGT[1]) checkSecret++;
                break;
            case 'G':
                myACGT[2]++;
                if(myACGT[2] == checkACGT[2]) checkSecret++;
                break;
            case 'T':
                myACGT[3]++;
                if(myACGT[3] == checkACGT[3]) checkSecret++;
                break;
        }
    }

    private static void Remove(char c) {
        switch (c) {
            case 'A':
                if(myACGT[0] == checkACGT[0]) checkSecret--;
                myACGT[0]--;
                break;
            case 'C':
                if(myACGT[1] == checkACGT[1]) checkSecret--;
                myACGT[1]--;
                break;
            case 'G':
                if(myACGT[2] == checkACGT[2]) checkSecret--;
                myACGT[2]--;
                break;
            case 'T':
                if(myACGT[3] == checkACGT[3]) checkSecret--;
                myACGT[3]--;
                break;
        }
    }
}