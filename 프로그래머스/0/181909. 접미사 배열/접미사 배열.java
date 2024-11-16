import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        String[] strArr = my_string.split("");
        int length = strArr.length;
        
        String[] answer = new String[length];

        for (int i  = length-1; i >= 0; i--) {
        answer[i] = my_string.substring(i,length);
        }
        Arrays.sort(answer);
        
        return answer;
    }
}