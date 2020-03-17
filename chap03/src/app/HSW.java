package app;

import java.util.Scanner;

/**
 * HSW
 */
public class HSW {

    public static void main(String[] args) {
        arrExist();
    }

    private static void arrExist() {
        // int[] trgtArr, int trgtArrLength,int[] srcArr, int srcArrLength

        try (Scanner scan = new Scanner(System.in);) {
            int trgtArrLength = scan.nextInt();
            int[] trgtArr = new int[trgtArrLength];
            for (int i = 0; i < trgtArrLength; i++) {
                trgtArr[i] = scan.nextInt();
            }
            int srcArrLength = scan.nextInt();
            int[] srcArr = new int[srcArrLength];
            for (int i = 0; i < srcArrLength; i++) {
                srcArr[i] = scan.nextInt();
            }
            // 소스배열 정렬
            for (int i = 0; i < srcArrLength; i++) {
                boolean flag = false;
                for (int j = 0; j < trgtArrLength; j++) {
                    if (srcArr[i] == trgtArr[j]) {
                        flag = true;
                        break;
                    } 
                }
                if (flag) {
                    System.out.println(1);
                }
                else {
                    System.out.println(0);
                }
            }
        }

    }

}
