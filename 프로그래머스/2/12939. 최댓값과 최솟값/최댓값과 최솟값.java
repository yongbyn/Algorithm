class Solution {
    public String solution(String s) {
        String[] strArr = s.split(" ");
        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < strArr.length; i++) {
            minValue = minValue > Integer.parseInt(strArr[i]) ? Integer.parseInt(strArr[i]) : minValue;
            maxValue = maxValue < Integer.parseInt(strArr[i]) ? Integer.parseInt(strArr[i]) : maxValue;
        }
            String answer = minValue + " " + maxValue; 
        return answer;
    }
}