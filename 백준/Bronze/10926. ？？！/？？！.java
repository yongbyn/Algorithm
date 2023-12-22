import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		
        // 라인단위로 입력받기(Enter를 경계로)
        // String str = br.readLine();
        
        // 정수형 입력
        // int i = Integer.parseInt(br.readLine());
        
        // Space를 경계로 나눌 때
        // String arr[] = str.split(" ");    

        String str = br.readLine();
	    System.out.println(str + "??!");		
	}
}