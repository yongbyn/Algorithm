import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        Stack<Integer> PipeStack = new Stack<>();

        int pipeNum = 0;
        for (int i = 0; i < input.length(); i++) {
            // 열린 괄호면 스택에 추가
            if (input.charAt(i) == '(') {
                PipeStack.push(i);
            }
            // 닫힌 괄호일 경우
            else if (input.charAt(i) == ')') {
                PipeStack.pop(); // 일단 stack에서 pop을 실행

                if (input.charAt(i - 1) == '(') { // 그 전 괄호가 열린 괄호면 레이저를 의미
                    pipeNum += PipeStack.size(); // 현재 stack의 사이즈만큼 더해 줌(레이저 절단 -> 파이프 수만큼 증가)
                } else { // 그 전 괄호가 닫힌 괄호면 파이프 끝 의미
                    pipeNum++; // 파이프 끝 부분만 추가
                }
            }
        }

        System.out.println(pipeNum);
        br.close();

    }

}
