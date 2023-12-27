import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String time = sc.nextLine();
        int cookingTime = sc.nextInt();

        String[] time_each = time.split(" ");
        int HH = Integer.parseInt(time_each[0]);
        int MM = Integer.parseInt(time_each[1]);
        MM = MM + cookingTime;

        while (MM>=60){
            MM = MM - 60;
            HH = HH + 1;
        }
        while (HH>=24){
            HH = HH - 24;
        }
        sc.close();

        System.out.printf("%d %d",HH,MM);
    }
}
