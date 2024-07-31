import java.util.*;

public class Main{
    public static void main(String[] args){
        
       Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        int c1,c2,r;
        double range1,range2;
        int num;
        
        for (int i = 0; i < T; i++){
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();   
            int n = sc.nextInt();
            num = 0;    
            for (int j = 0; j < n; j++){
            c1 = sc.nextInt();
            c2 = sc.nextInt();
            r = sc.nextInt();
            
            range1 = Math.sqrt(Math.pow((c1-x1),2) + Math.pow((c2-y1),2));
            range2 = Math.sqrt(Math.pow((c1-x2),2) + Math.pow((c2-y2),2));
            
            if ((range1 < r && range2 > r) || (range1 > r && range2 < r)) {
                num++;
            }
            }
            System.out.println(num);
        }
    }
}