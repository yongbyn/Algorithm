import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // scanner 객체 생성
        int S = input.nextInt(); // 입력받은 숫자 저장
        S = 1000 - S; // 거스름돈 계산 저장
        int count = 0; // 최초 잔돈 갯수
        int[] A ={500, 100, 50, 10, 5, 1}; // 개수 가장 적게 => 큰 잔돈부터
        for (int i=0; i<A.length;i++) {
            if (S >= A[i]) {
                int S_count = S / A[i]; // 잔돈 갯수 확인
                S = S - A[i] * S_count; // 거스름돈에서 액수 차감
                count += S_count; // 카운팅 추가
            }

        }
        System.out.println(count);

    }
}