class Solution {
    public int[] solution(int start_num, int end_num) {
        int N = end_num - start_num + 1;
        int[] answer = new int[N];
        for (int i = 0; i < N; i++) {
            answer[i] = start_num + i;
        }
        return answer;
    }
}