package app;

/**
 * YJY
 */
public class YJY {
    public static void main(String[] args) {

        int[] budgets = {120, 110, 140, 150};
        int M = 100;
        int result = solution(budgets, M);
        System.out.println(result);
    }
    private static int solution(int[] budgets, int M) {

        // 0. 합계 & 평균 구하기
        int MSum = 0;
        for (int i = 0; i < budgets.length; i++) {
            MSum += budgets[i];
        }
        int MAvg = MSum / budgets.length;

        // 1. 모든 요청이 배정될 수 있는 경우에는 요청한 금액 그대로 배정
        if (MSum <= M) {
            return M;
        }

        // 3. 나머지 금액에 대해서 찾아보자. 이때 평균.
        int mid = MAvg;
        int tmpSum = 0;
        int counter = 0;
        int result = 0;
        while (true) {
            counter++;
            // 여기서는 이진탐색과 다르게 키값을 찾으려는게 아니라
            // 예산최댓값을 찾는 것이다. 따라서
            int sum = 0;
            for (int i = 0; i < budgets.length; i++) {
                if (budgets[i] >= mid) {
                    budgets[i] = mid;
                }
                sum += budgets[i];
            }
            // 같은 경우는 최적의 값. 리턴
            if (sum == M) {
                result = mid;
                break;
            } 
            // M의 더 큰 경우에는 mid를 올려준다.
            else if (sum < M) {
                // 그러나 바로전 합계에서 tmpSum이 M보다 컸다면
                // 더 내려 가면 안된다. 리턴
                if(tmpSum > M){
                    result = mid;
                    break;
                }
                mid ++;
            } else {
                result = mid;
                mid --;
            }
            System.out.println("result : "+ result + ",  mid : " + mid + ",  tmpSum : " + tmpSum+ ",  M : " + M);
            tmpSum = sum;
        }
        System.out.println("loop count : "+ counter);
        return result;
    }
}
