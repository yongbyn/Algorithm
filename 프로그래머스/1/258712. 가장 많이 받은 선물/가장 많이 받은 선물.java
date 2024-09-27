import java.util.*;

class Solution {
    public int solution(String[] friends, String[] gifts) {      
        int answer = 0;
        
        // 선물을 주고 받은 기록을 이차원 배열로 기록
        int friendsLength = friends.length;
        
        // 친구들 이름과 index 저장
        HashMap<String, Integer> hm = new HashMap<>();
        
        // 선물 지수
        int[] giftDegree = new int[friendsLength];
        
        // 주고받은 선물
        int[][] giftGraph = new int[friendsLength][friendsLength];
        
        // 친구들 이름과 index 저장
        for (int i = 0; i < friendsLength; i++ )  {
            hm.put(friends[i], i);
        }
        
        for (String gift : gifts) {
            String[] giftName = gift.split(" ");
            int giverNo = hm.get(giftName[0]);
            int receiverNo = hm.get(giftName[1]);
            giftDegree[giverNo]++;
            giftDegree[receiverNo]--;
            giftGraph[giverNo][receiverNo]++;
        }
        
        for (int i = 0; i < friendsLength; i++) {
            int num = 0;
            for (int j = 0; j < friendsLength; j++) {
                if (i != j) {
                    if (giftGraph[i][j] > giftGraph[j][i] || 
                        (giftGraph[i][j] == giftGraph[j][i] && giftDegree[i] > giftDegree[j])) {
                        num++;
                    }
                }
            }
            answer = Math.max(answer, num);
        }
        
        return answer;
    }
}