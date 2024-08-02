import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
    
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int a,b;
        
        int T = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine()) ;
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            
            int temp = 1;
            for (int j = 0; j < b; j++) {
                temp = (temp * a) % 10;
            }
            
            if (temp == 0) temp = 10;
            
            System.out.println(temp);
        }
    }
}