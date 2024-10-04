import java.util.*;

class Solution {
    public int solution(int alp, int cop, int[][] problems) {
        int maxAlp = 0;
        int maxCop = 0;
        
        // 도달해야하는(최대값) 알고력, 코딩력 계산
        for (int[] problem : problems) {
            maxAlp = Math.max(maxAlp, problem[0]);
            maxCop = Math.max(maxCop, problem[1]);
        }
        
        // 현재 알고력과 코딩력이 max보다 크면 학습할 필요X
        alp = Math.min(alp, maxAlp);
        cop = Math.min(cop, maxCop);
        
        // DP 테이블 생성 (최대 목표치까지의 최소 시간 저장)
        int[][] dp = new int[maxAlp+1][maxCop+1];
        for(int[] row : dp) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }
        dp[alp][cop] = 0; // 현재 상태 초기화
        // 알고력alp, 코딩력cop를 달성하기까지 걸리는 최소시간 즉 0
        
        // DP 시작
        for (int i = alp; i <= maxAlp; i++) {
            for (int j = cop; j <= maxCop; j++) {
                // 공부로 증가
                if (i+1 <= maxAlp) {
                    // 공부로 증가하는 것과 증가된 dp 테이블 중 최소값으로 갱신
                    dp[i+1][j] = Math.min(dp[i+1][j], dp[i][j] + 1);
                }
                if (j+1 <= maxCop) {
                    dp[i][j+1] = Math.min(dp[i][j+1], dp[i][j] + 1);
                }
                // 문제풀이로 증가
                for (int[] problem : problems) {
                    int reqAlp = problem[0];
                    int reqCop = problem[1];
                    int rwdAlp = problem[2];
                    int rwdCop = problem[3];
                    int cost = problem[4];
                    
                    if (i >= reqAlp && j >= reqCop) {
                        // 학습력이 최대력을 넘어갈 경우 최대력으로 변경
                        int nextAlp = Math.min(maxAlp, i+rwdAlp);
                        int nextCop = Math.min(maxCop, j+rwdCop);
                        dp[nextAlp][nextCop] = Math.min(dp[nextAlp][nextCop], dp[i][j] + cost);
                    }
                }
            }
        }
        
        return dp[maxAlp][maxCop];
    }
}