import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 라인단위로 입력받기(Enter를 경계로)
        // String input = br.readLine();
        
        // 정수형 입력
        // int i = Integer.parseInt(br.readLine());
        // 정수형 입력 여러개 받을 때
        //  String[] input = br.readLine().split(" ");
        
        // Space를 경계로 나눌 때
        // String arr[] = input.split(" ");   
        
        String[] input = br.readLine().split(" ");
                
        int A = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);
        int C = Integer.parseInt(input[2]);
        
        System.out.println((A+B)%C);
        System.out.println(((A%C)+(B%C))%C);
        System.out.println((A*B)%C);
        System.out.println(((A%C)*(B%C))%C);
    }
}