package app;

import java.util.Arrays;

/**
 * ArrayParam
 */
public class ArrayParam {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        test(arr);
        System.out.println(Arrays.toString(arr));
        Test t = new Test();
        t.b();
        
    }

    static void test(int[] param) {
        param[2] = 9;
        System.out.println(Arrays.toString(param));
    }

}

class Test {

    void b(){
        int[] arr = {1, 2, 3, 4, 5};
        a(arr);
        System.out.println(Arrays.toString(arr));
    }

    void a(int[] param) {
        param[2] = 7;
    }

}
