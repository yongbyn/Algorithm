import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        // 오늘 날짜 분리 (yyyy, mm, dd)
        String[] todayArr = today.split("\\."); // ".":모든 문자 split, .은 \\ 붙여야함
        int todayYY = Integer.parseInt(todayArr[0]);
        int todayMM = Integer.parseInt(todayArr[1]);
        int todayDD = Integer.parseInt(todayArr[2]);
        
        // 약관 별 유효기간을 저장할 HashMap
        HashMap<String,Integer> hm = new HashMap<>();
        for (int i = 0; i < terms.length; i++) {
            String[] temp = terms[i].split(" ");
            String key = temp[0];
            int value = Integer.parseInt(temp[1]); // 유효기간(개월 수)
            hm.put(key, value);
        }
        
        List<Integer> expiredList = new ArrayList<>(); // 만료된 개인정보 인덱스를 저장할 리스트

        
        for (int i = 0; i < privacies.length; i++) {
            String[] privacyArr = privacies[i].split(" ");
            String[] dateArr = privacyArr[0].split("\\.");
            int YY = Integer.parseInt(dateArr[0]);
            int MM = Integer.parseInt(dateArr[1]);
            int DD = Integer.parseInt(dateArr[2]);
            String degree = privacyArr[1];
            
           // 약관에 따른 유효기간을 더함 (개월 수)
            MM += hm.get(degree);

            // 날짜 계산 (월이 12를 넘기면 연도로 반영)
            while (MM > 12) {
                MM -= 12;
                YY += 1;
            }
            
            // today와 비교하여 만료 여부 확인 (년 || 월 || 일)
            if (YY < todayYY || (YY == todayYY && MM < todayMM) || (YY == todayYY && MM == todayMM && DD <= todayDD)) {
                expiredList.add(i + 1); // index 저장
            }
        }
        
        // 결과 배열로 변환
        int[] answer = new int[expiredList.size()];
        for (int i = 0; i < expiredList.size(); i++) {
            answer[i] = expiredList.get(i);
        }
        return answer;
    }
}