import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int x1, y1, r1, x2, y2, r2;
        double range;

        for (int i = 0; i < N; i++){
            x1 = sc.nextInt();
            y1 = sc.nextInt();
            r1 = sc.nextInt();
            x2 = sc.nextInt();
            y2 = sc.nextInt();
            r2 = sc.nextInt();

            range = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));

            if (range == 0 && r1 == r2) {
                System.out.println(-1);
            } else if (range == (r1+r2) || range == Math.abs(r1 - r2)) {
                System.out.println(1);
            } else if (range < (r1+r2) && range > Math.abs(r1 - r2)) {
                System.out.println(2);
            } else {
                System.out.println(0);
            }
        }
    }
}