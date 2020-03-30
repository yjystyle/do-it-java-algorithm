package app;

import java.util.Arrays;

/**
 * PbwTest
 */
public class PbwTest {
    public static void main(String[] args) {
        for (int i=480; i<485; i++){
            solution(new int[]{120, 110, 140, 150}, i);
        }
        
    }

    public static int solution(int[] arr, int M) {
        int answer = 0;
        Arrays.sort(arr);
        int min = arr[0];
        int max = arr[arr.length-1];
        int mid = (min+max)/2;
        int sum = 0;
        
        for(int i = 0; i<arr.length; i++) {
            sum+=arr[i];
        }

        while(sum > M) {
            sum = 0;
            for(int i = 0; i<arr.length; i++) {
                if(arr[i] > mid) {
                    arr[i] = mid;
                }
                sum += arr[i];
            }
            if(sum > M) {
                mid = mid-1;
            }
            System.out.println(Arrays.toString(arr));
        }
        System.out.println(mid);
        return mid;
    }
}