import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int n;
    static char[] signs;
    static boolean[] visited = new boolean[10]; // 숫자(0-9) 표시 방문
    static String minValue = "", maxValue = "";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        signs = new char[n];
        String[] temp = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            signs[i] = temp[i].charAt(0);
        }

        findMinMax("");
        System.out.println(maxValue);
        System.out.println(minValue);
    }

    public static void findMinMax(String num) {
        if (num.length() == n + 1) {
            if (minValue.equals("") || num.compareTo(minValue) < 0) {
                minValue = num;
            }
            if (num.compareTo(maxValue) > 0) {
                maxValue = num;
            }
            return;
        }

        for (int i = 0; i <= 9; i++) {
            if (!visited[i]) {
                if (num.isEmpty() || checkCondition(num.charAt(num.length() - 1), (char) (i + '0'), signs[num.length() - 1])) {
                    visited[i] = true;
                    findMinMax(num + i);
                    visited[i] = false;
                }
            }
        }
    }

    public static boolean checkCondition(char a, char b, char sign) {
        if (sign == '<') {
            return a < b;
        } else {
            return a > b;
        }
    }
}