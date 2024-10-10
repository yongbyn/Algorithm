import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> hm = new HashMap<>();
        
        for (String p : participant) {
            hm.put(p, hm.getOrDefault(p, 0) + 1);
        }
        
        for (String c : completion) {
            hm.put(c, hm.get(c) - 1);
        }
        
        /*
        String answer = "";
        for (String key : hm.keySet()) {
        if (map.get(key) != 0){
        answer = key;
        break;
        }
        */
        
        //위의 코드 대신 아래 코드도 사용가능. EntrySet이 반복문을 사용할때 속도가 더 빠름
        String answer = "";
        Iterator<Map.Entry<String, Integer>> iter = hm.entrySet().iterator(); 
        while (iter.hasNext()) { 
            Map.Entry<String, Integer> entry = iter.next(); 
            if (entry.getValue() != 0) { 
                answer = entry.getKey();
                break;
            } 
        }
        return answer;
    }
}