import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int diceA = sc.nextInt();
        int diceB = sc.nextInt();
        int diceC = sc.nextInt();
        int diceMax = 1;
        int Price;
        if ((diceA == diceB) && (diceB == diceC)){
            diceMax = diceA;
            Price = 10000+(diceMax)*1000;
        }else if((diceA == diceB) && (diceB != diceC)){
            diceMax = diceA;
            Price = 1000+(diceMax)*100;
        }else if((diceA == diceC) && (diceB != diceC)){
            diceMax = diceA;
            Price = 1000+(diceMax)*100;
        }else if((diceB == diceC) && (diceA != diceB)) {
            diceMax = diceB;
            Price = 1000+(diceMax)*100;
        }else{
            diceMax = diceMax<diceA ? diceA : diceMax;
            diceMax = diceMax<diceB ? diceB : diceMax;
            diceMax = diceMax<diceC ? diceC : diceMax;
            Price = (diceMax)*100;
        }

        sc.close();

        System.out.println(Price);

    }
}
