import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // scanner 객체 생성
        int N = input.nextInt(); // 입력받은 문자열 저장
        int N_bag=0; // 봉지 수
        
        if ( N%5 == 0){ 
            N_bag = N/5;
        }else if((N%5) == 1||(N%5) == 3){
            N_bag = (N/5)+1;
        }else if((N%5) == 2||(N%5) == 4){
            N_bag = (N/5)+2;
        }
        
        if(N==3){ // 예외 설정
            N_bag = 1;
        }else if(N==4 || N==7){
            N_bag = -1;
        }
            System.out.println(N_bag);
    }
}