import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Main{

    static int[][] paper;
    static int white;
    static int blue;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        paper = new int[N][N];

        for (int i=0; i<N; i++) {
            String[] str = br.readLine().split(" ");
            for (int j=0; j<N; j++){
                paper[i][j] = Integer.parseInt(str[j]);
            }
        }

        divide(0, 0, N);

        System.out.println(white);
        System.out.println(blue);
}

static void divide(int x, int y, int n){
    if(isSameAllColor(x,y,n)){ // 모든 종이 색이 같은지 확인
        if(paper[x][y] == 0){
            white++;
        }else{
            blue++;
        }
        return; // if 문 들어오면 아래 재귀 필요없으므로 return
    }

    // 같지 않으면 크기 size 반으로
    int n2 = n/2;

    // 4분할 탐색
    divide(x, y, n2); // 왼쪽 위
    divide(x, y + n2, n2); // 오른쪽 위
    divide(x + n2, y, n2); // 왼쪽 아래
    divide(x + n2, y + n2, n2); // 오른쪽 아래

    }
    static boolean isSameAllColor(int x, int y, int n){
        int color = paper[x][y];

        for(int i=x; i<x+n; i++){
            for(int j=y; j<y+n; j++){
                if(paper[i][j] != color) return false; // 하나라도 다르면 false
            }
        }
        return true; // 같은 색
    }
}
