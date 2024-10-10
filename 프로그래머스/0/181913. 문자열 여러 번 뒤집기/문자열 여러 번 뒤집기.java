import java.util.*;

class Solution {
    public String solution(String my_string, int[][] queries) {

        String[] myStringArr = my_string.split("");
        for (int i = 0; i < queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];

            while (s < e) {
                String temp = myStringArr[s];
                myStringArr[s] = myStringArr[e];
                myStringArr[e] = temp;
                s++; e--;
            }
        }

        String answer = "";
        for (String a : myStringArr) {
            answer += a;
        }

        return answer;
    }
}