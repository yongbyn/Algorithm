import java.util.*;

class Solution {
    public int solution(int[] nums) {
        
        int max = nums.length / 2;
        
        HashSet<Integer> hashNums = new HashSet<>();
        
        for (int num : nums) {
            hashNums.add(num);
        }
        
        if (hashNums.size() > max) {
            return max;
        } else {
            return hashNums.size();
        }
    }
}