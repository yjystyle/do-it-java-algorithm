package app;

import java.util.Arrays;

/**
 * Q2 배열 역순
 */
public class Q2 {

    public static void main(String[] args) {
        
        int[] arr = {5,10,73,2,-5,42};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr) {
        for (int i=0; i < arr.length/2; i++){
            int temp;
            temp = arr[arr.length-i-1];
            arr[arr.length-i-1] = arr[i];
            arr[i]= temp;
            System.out.println(Arrays.toString(arr));
        }
    }



    
}