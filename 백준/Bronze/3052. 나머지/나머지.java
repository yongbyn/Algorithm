import java.io.*;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<Integer> hash_remain = new HashSet<>(); // 해쉬 셋(겹치는 수는 저장 X)

        int div_num = 42; // 나눌 수

        for (int i=0;i<10 ;i++) {
            hash_remain.add(Integer.parseInt(br.readLine())%div_num); // 나머지 구한 후 저장
        }

        System.out.println(hash_remain.size());
    }
}