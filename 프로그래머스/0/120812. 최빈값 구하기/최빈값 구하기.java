import java.util.*;

class Solution {
    public int solution(int[] array) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int num : array) {
            map.put(num,map.getOrDefault(num, 0) + 1);
        }
        
        int maxFreq = Collections.max(map.values());
        int answer = -1;
        int maxCount = 0;
        
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == maxFreq) {
                if (maxCount == 0) {
                    answer = entry.getKey();
                    maxCount++;
                } else {
                    answer = -1;
                }
            }
        }
        
        return answer;
    }
}