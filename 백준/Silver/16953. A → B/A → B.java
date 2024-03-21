// 16953.java
// 24.03.21. BFS 해설 봄

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

import static java.util.Arrays.stream;


public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] input = stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        long A = input[0];
        long B = input[1];

        Queue<Long> queue = new LinkedList<>();
        // 계산 2가지 추가
        queue.add(A*2);    // 2배
        queue.add(A*10+1); // 맨 오른쪽 1 추가

        int ans = 0;
        while(!queue.isEmpty()) {
            ans++;
            int size = queue.size();
            for (int i=0; i<size; i++){
                long current = queue.poll();
                if(current>B) continue;
                if(current==B) {
                    System.out.println(ans+1);
                    return;
                }
                queue.add(current*2);
                queue.add(current*10 +1);
            }
        }
        System.out.println(-1);
    }
}