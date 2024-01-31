import java.io.*;


public class Main{

    static int N;
    static int[][] S;
    static boolean[] visit;
    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    N = Integer.parseInt(br.readLine());
    S = new int[N][N];
    visit = new boolean[N];

    for (int i=0; i<N; i++){
        String line = br.readLine();
        String[] line_arr = line.split(" ");
        for (int j=0; j<N; j++) {
            S[i][j] = Integer.parseInt(line_arr[j]);
        }
    }

    combi(0,0);


    bw.write(String.valueOf(min));

    bw.flush();
    bw.close();
    br.close();

    }

    // idx : index, cnt : Combination 실행 여부 판단
    static void combi(int idx, int cnt) {
        
        //{nC(n/2)가 될 경우 계산}
        if (cnt == N/2){
            diff(); // 두 팀 능력치 차이 계산
            return;
        }

        //팀 정하기
        for(int i=idx; i<N; i++){
            if(!visit[i]){
                visit[i] = true;
                combi(i+1, cnt+1); // 재귀
                visit[i] = false; // 재귀 후 false로 변경
            }
        }
    }

    // 두 팀 능력치 차이 계산
    static void diff(){
        int team_start = 0;
        int team_link = 0;

        for (int i=0; i< N-1; i++){
            for (int j=i+1; j<N; j++){
                //true와 false로 팀 구분
                if (visit[i] && visit[j]){
                    team_start += S[i][j] + S[j][i];
                }
                else if (!visit[i] && !visit[j]){
                    team_link += S[i][j] + S[j][i];
                }
            }
        }
        // 능력치 차이
        int score = Math.abs(team_start - team_link);

        // 차이가 0이면 최소값이므로 종료
        if (score == 0){
            System.out.println(score);
            System.exit(0); // 강제 정상종료, 비정상은 1
        }

        min = Math.min(score,min);
    }
}
