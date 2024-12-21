class Solution {
    public int solution(int n) {
        int num = n/7;
        return n%7 ==0 ? num : num + 1;
    }
}