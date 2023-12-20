import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // scanner 객체 생성
        String A = input.nextLine(); // 입력받은 문자열 저장
       
        A = A.trim();        //양쪽 공백 제거

        if (A.length() == 0) { // 공백이었을 경우 "" => 길이 0
            System.out.println(0);
            }else{
            String[] txt = A.split(" "); // 문자열 공백으로 자르기
            System.out.println(txt.length);
            }
   }
}
