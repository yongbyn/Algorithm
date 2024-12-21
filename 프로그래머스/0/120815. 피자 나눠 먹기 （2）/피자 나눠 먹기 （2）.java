class Solution {
    public int solution(int n) {
        return lcm(6,n)/6;
    }
    
    public int gcd(int a, int b) {
        if (a < b) {
            int temp = b;
            b = a;
            a = temp;
        }
        int temp = 0;
        while ( b != 0) {
            temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
    
    public int lcm(int a, int b) {
        return (a * b) / gcd(a,b);
    }
}