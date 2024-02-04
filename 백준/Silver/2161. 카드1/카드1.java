import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Main{

    static int N;

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());
        Queue<Integer> cards = new LinkedList<>();

        for (int i=1; i<N+1; i++){
            cards.offer(i);
        }

        StringBuilder newCards = new StringBuilder();


        while(true){
            // 첫번째 값 빼서 newCards에 저장
            newCards.append(cards.poll()).append(" ");

            if (cards.size()==0)  break; // 카드 비우면 브레이크

            // 다음카드 맨 뒤로 옮기기
            cards.offer(cards.poll());

        }


        bw.write(String.valueOf(newCards));

        bw.flush();
        bw.close();
        br.close();

    }
}