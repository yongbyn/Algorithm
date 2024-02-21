public class Main{


    public static void main(String[] args)  {

        int N = 10000;
        
        // selfnumber인지 확인하기 위해
        boolean[] isNotSelfNum = new boolean[N+1];

        //selfumber 확인 1~N까지
        for (int i=1; i<N; i++){
            // num : 각 자리수 구하기 귀한 변수
            // sum : 누적합 구하기 위한 변수 
            int num = i, sum = i; 

            // 일의자리 수 / 10 = 0이므로 while문
            while (num > 0){
                // 나머지 -> 일의자리 더하기
                sum += num % 10;
                // 10씩 나누기 -> 십=>일의자리로 당기기
                num /= 10; 
            }

            // 누적합이 구하고자 하는 수 안에 있으면 그 수는 selfnumber가 아님
            if (sum < N){
                isNotSelfNum[sum] = true;
            }
        }

        for (int j=1;j<N;j++) {
            if (!isNotSelfNum[j]){
                System.out.println(j);
        }

    }
}
}
