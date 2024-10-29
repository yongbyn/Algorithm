class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] sArr = s.split("");
        int n = 0;

        if (sArr[0].equals("-")) {
            for (int i = sArr.length-1; i>0; i--) {
                answer += (int) Integer.parseInt(sArr[i]) * Math.pow(10, n);
                n++;
            }
            answer *= -1;
        } else if(sArr[0].equals("+")) {
            for (int i = sArr.length-1; i>0; i--) {
            answer += (int) Integer.parseInt(sArr[i]) * Math.pow(10, n);
            n++;
            }
        } else {
            for (int i = sArr.length-1; i>=0; i--) {
                answer += (int) Integer.parseInt(sArr[i]) * Math.pow(10, n);
                n++;
            }
        }
        return answer;
    }
}