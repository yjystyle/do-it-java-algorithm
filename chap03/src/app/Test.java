package app;

import java.util.Arrays;

/**
 * Test
 */
public class Test {

    
    public static void main(String[] args) {
        
        long[][] arr =  getInterval(1583798400,1583884800,3);

        long lastOne = arr[arr.length-1][arr[2-1].length-1];
        System.out.println(lastOne);

        System.out.println(Arrays.deepToString(arr));


    }



    static long[][] getInterval(long start, long end, int dCount){

        // divideCount=2, 2*2 배열
        // divideCount=3, 3*2 배열
        // 다시말하면 divicdeCount * 2 배열 

        // from에 더해야 할 수는
        // (24 / dCount) * 60 * 60

        long[][] arr = new long[dCount][2];
        
        long interval = (end - start) / dCount;
        
        // 3을 기준으로 하면

        long from = start;
        for (int i=0; i<arr.length; i++){
            // from
            arr[i][0] = from;
            // to
            arr[i][1] = from + interval - 1;
            from = from + interval;
        }

        return arr;
    }

}