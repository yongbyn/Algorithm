import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int result = 1;
        for (int i=0; i<length/2; i++) {
            if (charArray[i] != charArray[length-i-1]) {
                result = 0;
                break;
			}
        }
        System.out.println(result);
    }
}