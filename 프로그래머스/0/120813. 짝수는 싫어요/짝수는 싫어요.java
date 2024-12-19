import java.util.*;

class Solution {
    public int[] solution(int n) {
        int num = (int) Math.round((double) n/2);
        int[] answer = new int[num];
        
        for (int i = 0; i < num; i++) {
            answer[i] = 2*i+1;
        }
        
        return answer;
    }
}