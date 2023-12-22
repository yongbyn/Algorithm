import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // scanner 객체 생성
        String S = input.nextLine(); // 입력받은 문자열 저장
        int[] arr = new int[26]; // 결과값 입력위한 빈배열(a~z)
         
        for(int i=0;i<arr.length;i++){
            arr[i]=-1; // 전부 -1 처리
        }
        
        for(int j=0; j<S.length();j++){
            char alpabet = S.charAt(j);
            // 중복될 경우 저장X
            if(arr[alpabet - 'a'] == -1){ // int 'a' = 97, 'a'-'a' = 0임
                arr[alpabet - 'a'] = j;
            }          
        }
        for (int k:arr){
            System.out.print(k + " ");
        }
    }
}