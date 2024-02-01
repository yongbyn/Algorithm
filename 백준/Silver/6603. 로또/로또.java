import java.io.*;
import java.util.ArrayList;


public class Main{

    static int k;
    static int[] S;
    static boolean[] use;
    static ArrayList<Integer> LOTTO;

    public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    LOTTO = new ArrayList<>(); // 6개 배열

    while (true){
            String line = br.readLine();
            String[] line_arr = line.split(" ");
            k = Integer.parseInt(line_arr[0]);
            S = new int[k];

            if (k==0) break;
            for (int i = 0; i < k; i++) {
                S[i] = Integer.parseInt(line_arr[i + 1]);
            }
            use = new boolean[k];

        combi(0,0);

        System.out.println();
        }



//    bw.write(String.valueOf());
//
//    bw.flush();
//    bw.close();
    br.close();

    }

    // idx : index, cnt : Combination 실행 여부 판단
    static void combi(int idx, int cnt) {

        //{nC(6)이 될 경우 계산}
        if (cnt == 6){
            pick_lotto(); // 두 팀 능력치 차이 계산
            return;
        }

        //6개 정하기
        for(int i=idx; i<k; i++){
            if(!use[i]){
                use[i] = true;
                combi(i+1, cnt+1); // 재귀
                use[i] = false; // 재귀 후 false로 변경
            }
        }
    }

    // 두 팀 능력치 차이 계산
    static void pick_lotto(){
        for (int i=0; i<k; i++){
                //true와 false로 팀 구분
                if (use[i]){
                    LOTTO.add(S[i]);
                }
        }
        for (Integer lotto : LOTTO) {
            System.out.print(lotto + " ");
        }
        System.out.println(); //줄바꿈

        LOTTO.clear(); // 리스트 초기화
    }
}
