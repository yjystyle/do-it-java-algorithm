package app;

import java.util.Arrays;

/**
 * PrimeNumber2 소수는 어떠한 소수로도 나누어지지 않는다.
 * 
 */
public class PrimeNumber2 {

    public static void main(String[] args) {
    
  
        int[][] x;
        x = new int[2][];
        x[0] = new int[4];
        x[1] = new int[5];

        System.out.println(Arrays.deepToString(x));

        int[][] y = x.clone();
        y[1][1] = 3;


        System.out.println(Arrays.deepToString(x));

        System.out.println(x==y);
        System.out.println(x[0]==y[0]);


    }

    
}