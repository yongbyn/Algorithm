import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                
        int num1 = Integer.parseInt(br.readLine()); // 숫자 한 줄 씩 부르기
        int num2 = Integer.parseInt(br.readLine());
        int num2_100 = num2/100;            // 백의 자리 수
        int num2_10 = (num2-num2_100*100)/10;    // 십의 자리 수
        int num2_1 = (num2-num2_100*100-num2_10*10);    // 일의 자리 수
        
        System.out.println(num1*num2_1);
        System.out.println(num1*num2_10);
        System.out.println(num1*num2_100);
        System.out.println(num1*num2_1+num1*num2_10*10+num1*num2_100*100);
    }
}