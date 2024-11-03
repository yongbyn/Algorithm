class Solution {
    boolean solution(String s) {
        String[] sArr = s.toLowerCase().split("");

        int pNum = 0;
        int yNum = 0;
        for (int i = 0; i < sArr.length; i++) {
            if (sArr[i].equals("p")) {
                pNum++;
            } else if (sArr[i].equals("y")) {
                yNum++;
            }
        }

        return pNum == yNum ? true : false;
    }
}