import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        
        Map<Character, Integer> map = new HashMap<>();
        
        for (int i = 0; i < survey.length; i++) {
            int value = choices[i] - 4;
            
            if(value < 0) {
                char key = survey[i].charAt(0);
                map.put(key, map.getOrDefault(key, 0) + Math.abs(value));
            } else if (value > 0) {
                char key = survey[i].charAt(1);
                map.put(key, map.getOrDefault(key, 0) + value);
            }
        }
        
        StringBuilder sb = new StringBuilder();
        sb.append(map.getOrDefault('R', 0) >= map.getOrDefault('T', 0) ? 'R' : 'T')
            .append(map.getOrDefault('C', 0) >= map.getOrDefault('F', 0) ? 'C' : 'F')
            .append(map.getOrDefault('J', 0) >= map.getOrDefault('M', 0) ? 'J' : 'M')
            .append(map.getOrDefault('A', 0) >= map.getOrDefault('N', 0) ? 'A' : 'N');
        
        return sb.toString();
    }
}