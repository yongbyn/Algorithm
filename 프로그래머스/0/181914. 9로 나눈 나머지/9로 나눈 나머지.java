import java.util.*;

class Solution {
    public int solution(String number) {
        String[] numberArr = number.split("");
        
        int num = 0;
        for (String numStr : numberArr) {
            num += Integer.parseInt(numStr);
        }
        return num%9;
    }
}