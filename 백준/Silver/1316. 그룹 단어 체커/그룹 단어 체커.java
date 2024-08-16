import java.io.*;
import java.util.*;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int groupWordCount = 0;

        for (int i = 0; i < N; i++) {
            String word = br.readLine();
            boolean[] alphabet = new boolean[26];
            boolean isGroupWord = true;
            char prevChar = ' '; // 이전 문자를 저장할 변수

            for (int j = 0; j < word.length(); j++) {
                char currentChar = word.charAt(j);

                if (currentChar != prevChar) { // 이전 문자와 다른 경우에만 체크
                    if (alphabet[currentChar - 'a']) { // 이미 등장한 문자라면 그룹 단어가 아님
                        isGroupWord = false;
                        break;
                    }
                    alphabet[currentChar - 'a'] = true; // 등장한 문자로 기록
                }
                prevChar = currentChar; // 이전 문자를 현재 문자로 업데이트
            }

            if (isGroupWord) { 
                groupWordCount++;
            }
        }

        System.out.println(groupWordCount);
    }
}