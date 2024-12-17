class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int lcmNum = lcm(denom1, denom2);
        int newNumer1 = lcmNum / denom1 * numer1;
        int newNumer2 = lcmNum / denom2 * numer2;
        int numer3 = newNumer1 + newNumer2;
        int denom3 = lcmNum;
        
        int gcdNum = gcd(numer3, denom3);
        numer3 /= gcdNum;
        denom3 /= gcdNum;
        
        int[] answer = {numer3, denom3};
        return answer;
    }
    
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
}