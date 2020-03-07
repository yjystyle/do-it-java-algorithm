package app;

import java.util.Scanner;

/**
 * BinSearch
 */

public class BinSearch {


    // 요솟수가 n인 배열 a에서 Key와 같은 요소를 이진 검색합니다.
    static int binSearch (int[] a, int n, int key){
        // 검색 범위의 첫 인덱스
        int pl = 0;

        // 검색 범위의 끝 인덱스
        int pr = n -1;

        do {
            int pc = (pl + pr) / 2;
            if (a[pc] == key) return pc;
            else if (a[pc] < key) pl = pc + 1;
            else pr = pc -1;
        } while (pl <= pr);

        return -1;
    }




    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);

        System.out.println("요솟수 : ");
        int num = stdIn.nextInt();
        int[] x = new int[num];

        System.out.println("오름차순으로 입력하세요");

        System.out.println("x[0] : ");
        x[0] = stdIn.nextInt();

        // 귀찮아서 하기 부분은 소스 이해하고 넘어감.

        
        System.out.println("1");
    }
    
}