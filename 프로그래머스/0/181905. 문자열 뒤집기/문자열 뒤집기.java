class Solution {
    public String solution(String my_string, int s, int e) {
            char[] my_charArray = my_string.toCharArray();
            String answer = "";
            for (int i = 0; i < s; i++) {
                answer += my_charArray[i];
            }

            for (int i = s; i < e+1; i++) {
                answer += my_charArray[e+s-i];
            }

            if (my_charArray.length > e) {
                for (int i = e+1; i < my_charArray.length; i++) {
                    answer += my_charArray[i];
                }
            }

            return answer;
    }
}