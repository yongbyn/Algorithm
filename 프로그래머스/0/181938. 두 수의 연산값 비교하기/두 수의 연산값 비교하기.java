import java.util.*;

class Solution {
    public int solution(int a, int b) {
        int aPlusB = Integer.parseInt(a + "" + b);
        int aProdB = 2*a*b;
    
        return Math.max(aPlusB,aProdB);
    }
}