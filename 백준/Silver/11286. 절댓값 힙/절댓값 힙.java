import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> q = new PriorityQueue<>((o1,o2) -> {
            int firstAbs = Math.abs(o1);
            int secondAbs = Math.abs(o2);
            if(firstAbs == secondAbs) { // 절대값 같은 경우 음수 우선
                return o1 > o2 ? 1 : -1;
            }
            return firstAbs - secondAbs; // 절대값 작은 데이터 우선
        });
        
        for (int i = 0; i < N; i++) {
            int req = Integer.parseInt(br.readLine());
            if(req == 0) {
                if(q.isEmpty()) {
                    System.out.println("0");
                } else {
                    System.out.println(q.poll());
                }
            } else {
                q.add(req);
            }
        }
    }
}