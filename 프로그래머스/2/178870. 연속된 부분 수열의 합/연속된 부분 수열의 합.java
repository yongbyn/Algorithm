class Solution {
    public int[] solution(int[] sequence, int k) {
        int[] result = new int[2];
        int n = sequence.length;
        int left = 0;
        int right = 0;
        int d = n+1;
        int S = sequence[0]; // 시작 S 값
        while (left <= right && right < n){
            if (S < k){ // 작으면
                right++; // 오른쪽 늘리고
                if (right == n){
                    break;
                }
                S += sequence[right]; // 합 증가
            }
            else if(S > k){ // 크면
                S -= sequence[left]; // 왼쪽 줄이고
                left++; // 왼쪽 증가
            }
            else{ // 값이 일치할 때
                if (d > right - left + 1){ // 기존보다 거리가 작을 때 수행
                    d = right - left + 1;
                    result[0] = left;
                    result[1] = right;
                }
                S -= sequence[left]; // 크기를 줄여야하므로 왼쪽을 이동
                left++;         
            }
        }
        
        return result;
    }
}