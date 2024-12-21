class Solution {
    public int[] solution(int money) {
        int americano = 5500;
        int[] answer = new int[2];
        answer[0] = money/americano;
        answer[1] = money - (money/americano) * americano;
        return answer;
    }
}