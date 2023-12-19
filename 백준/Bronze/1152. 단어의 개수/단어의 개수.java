import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = br.readLine().split(" ");

        if(arr.length == 0){
            System.out.print(0);
            System.exit(0);
        }

        if(arr[0] == "") {
            System.out.println(arr.length - 1);
        }else{
            System.out.println(arr.length);
        }

    }
}