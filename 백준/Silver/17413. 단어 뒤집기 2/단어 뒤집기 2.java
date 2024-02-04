import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main{

    static String S;
    static char s;
    static boolean isInTag;

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        S = br.readLine();

        isInTag = false;

        StringBuilder strAns = new StringBuilder();
        Stack<String> strTemp = new Stack<>();

        for (int i=0; i<S.length();i++) {

            s = S.charAt(i);

            if (s == '<') { // < 만나면
                while (!strTemp.isEmpty()){
                    strAns.append(strTemp.pop()); // 그 전까지 뒤집어서 저장
                }
                isInTag = true;
                strAns.append(s); // < 저장
            }else if (s == '>'){ // > 만나면
                isInTag = false;
                strAns.append(s); // < 저장
            }else if (isInTag){ // <> 내부 저장
                strAns.append(s);
            }
            else if (s == ' ' ){ // 공백 만나면 저장
                while (!strTemp.isEmpty()){
                    strAns.append(strTemp.pop()); // 그 전까지 뒤집어서 저장
                }
                strAns.append(s); // 공백 저장
            }else { // 아무것도 아니면
                strTemp.push(String.valueOf(s)); // 뒤집어서 출력되게끔 저장
            }

        }

        while (!strTemp.isEmpty()){ // 마지막에 띄어쓰기나 tag로 안끝날 경우 한 번 더 실행
            strAns.append(strTemp.pop()); // 그 전까지 뒤집어서 저장
        }

        System.out.println(strAns);

        br.close();

    }
}