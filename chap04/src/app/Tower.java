package app;

import java.util.Arrays;

/**
 * Tower
 */
public class Tower {

    
    public static void main(String[] args) {
        
        int[] arr = {6,9,5,7,4};
        int[] arr2 = arr.clone();
    
        arr2[0] = 0;
        for (int i=0; i<arr.length; i++){
            for(int j=i-1; j>=0; j--){
                if (arr[i] < arr[j]){
                    arr2[i] = j+1;
                    break;
                }else{
                    arr2[i] = 0;

                }
            }
        }

        System.out.println(Arrays.toString(arr2));

       
    }
}