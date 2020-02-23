package app;

import java.util.Arrays;

public class CloneArray {
    
    public static void main(String[] args) throws Exception {

        int[] a = {1,2,3,4,5};
        
        // b는 a의 복제를 참조
        int[] b = a.clone();

        b[3] = 0;
        int[] c = new int[5];
        System.arraycopy(a, 0, c, 0, a.length);
        c[1] = 10;
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(c));
        

    }

    
}