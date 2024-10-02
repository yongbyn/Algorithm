import java.util.*;

class Solution {
    public int solution(int[] queue1, int[] queue2) {
        long sum1 = 0;
        long sum2 = 0;
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        for (int i = 0; i < queue1.length; i++) {
            sum1 += queue1[i];
            sum2 += queue2[i];
            q1.add(queue1[i]);
            q2.add(queue2[i]);
        }
        int count = 0;
        
        while(sum1 != sum2) {
            if (count > (queue1.length + queue2.length) * 2) {
                count = -1;
                break;
            }
            int temp = 0;
            if (sum1 < sum2) {
                temp = q2.poll();
                q1.add(temp);
                sum1 += (long) temp;
                sum2 -= (long) temp;
                count++;
            }
            else if(sum1 > sum2) {
                temp = q1.poll();
                q2.add(temp);
                sum1 -= (long) temp;
                sum2 += (long) temp;
                count++;
            } 
        }
        return count;
    }
}