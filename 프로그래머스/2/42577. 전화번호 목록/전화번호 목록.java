import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        HashMap<String, Integer> map = new HashMap<>();
        
        // 전화번호 저장
        for (String phone : phone_book) {
            map.put(phone, 1);
        }
        
        // 접두어 확인
        for (String phone : phone_book) {
            // 접두어일 경우를 제외하기 위해 map에서 일단 제거
            map.remove(phone);
            // substring(0,0) = ""
            for (int i = 1; i < phone.length(); i++) {
                if (map.containsKey(phone.substring(0,i))) {
                    return false;
                }    
            }
            // 비교 후 다시 추가
            map.put(phone, 1);
        }
        
        
        return true;
    }
}