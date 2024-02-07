import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main{

    static int N;
    static int[] AN;
    static int M;
    static int[] AM;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        AN = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        M = Integer.parseInt(br.readLine());
        AM = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        Arrays.sort(AN); // 오름차순 정렬

        int[] ansArr = new int[M];

        for (int i=0; i<M; i++){
            ansArr[i] = binarySearch(AM[i],AN); // 찾을 key와 기준이 될 배열
            System.out.print(ansArr[i] + "\n"); // for문 따로 안돌릴려고
        }
    }

    public static int binarySearch(int key, int[] AN){
        int low = 0; 
        int mid;
        int high = N - 1;

        while(low <= high){ // 이분탐색 조건
            mid = (low + high) / 2;

            if (AN[mid] == key){ // 가운데
                return 1;
            }else if (AN[mid] > key){ // 왼쪽
                high = mid - 1;
            }else { // AN[mid] < key // 오른쪽
                low = mid + 1;
            }
        }
        return 0; // low가 high보다 커졌는데 AN에 key랑 같은 값이 없으면 0 출력
    }
}