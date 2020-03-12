package app;

import java.util.Arrays;

class Hsw {

   static char[][] bingo;

   // 실행
   public static void main(String[] args) {

      bingo = makeBingo();

      // RotationBingo(bingo);
      FindEngWord(bingo);

   }

   // 8X8 빙고 만들기
   static char[][] makeBingo() {

      System.out.println("****************** 8 X 8 ******************");

      char[][] tempArray = { { 'C', 'A', 'R', 'F', 'G', 'W', 'Q', 'O', }, { 'H', 'D', 'E', 'N', 'D', 'E', 'Q', 'C' },
            { 'C', 'V', 'Q', 'A', 'K', 'B', 'R', 'T' }, { 'S', 'Q', 'D', 'C', 'L', 'K', 'Q', 'S' },
            { 'B', 'T', 'B', 'B', 'I', 'B', 'T', 'P' }, { 'E', 'B', 'Y', 'R', 'M', 'U', 'I', 'O' },
            { 'P', 'K', 'Y', 'T', 'D', 'Q', 'C', 'V' }, { 'B', 'N', 'U', 'Y', 'B', 'E', 'W', 'X' },
            { 'N', 'U', 'R', 'T', 'C', 'E', 'K', 'B' }, };

      // for(int i = 0 ; i < tempArray.length; i++){
      // for(int z = 0 ; z<tempArray[i].length; z++){
      // System.out.print( "[" + tempArray[i][z] +"]" );
      // }
      // System.out.println();
      // }

      System.out.println("******************************************");

      return tempArray;
   }

   static void RotationBingo(char[][] arr) {

      char[][] trgtArr = new char[9][8];
      // 회전시키고 싶은 사각형의 가장 왼쪽 상단 좌표
      // (i, j)
      int[] origin = { 1, 2 };
      int oX = origin[0];
      int oY = origin[1];
      int d = oY - oX;
      // 회전하고자 하는 사각형 크기
      // (m, n)
      int[] size = { 4, 4 };
      int sX = size[0];
      int sY = size[1];
      // 배열을 복사하고 시작하는 것도 좋지만 loop에서 채워 넣어도 무방하다.

      for (int i = 0; i < arr.length; i++) {
         char[] trgtArrRow = arr[i].clone();
         for (int j = 0; j < arr[i].length; j++) {
            // 범위 설정
            if ((i == oX || i == oX + sX - 1) && (j >= oY && j <= oY + sY - 1)
                  || (i >= oY && i <= oX + sX - 1) && (j == oY || j == oY + sY - 1)) {
               trgtArrRow[j] = arr[6 - j][i + d];
            }
         }
         // 넣어준다.
         trgtArr[i] = trgtArrRow;
      }

      for (int i = 0; i < trgtArr.length; i++) {
         for (int z = 0; z < trgtArr[i].length; z++) {
            System.out.print("[" + trgtArr[i][z] + "]");
         }
         System.out.println();
      }

      /***
       * 정답란
       */

   }

   static void FindEngWord(char[][] arr) {

      // 열
      int n = 8;
      // 행
      int m = 9;

      for (int i = 0; i < arr.length; i++) {

         char[][] daegaksun = new char[n+ m -1][];
         int count = 0;
         if (i == 0) {
            for (int j = 0; j < arr[i].length; j++) {
               // 대각선 행렬
               // int[][] tmp = new int[16][];
               char[] tmp2 = new char[j + 1];
               for (int k = 0; k <= j; k++) {
                  tmp2[k] = arr[k][j - k];
               }
               // System.out.println(Arrays.toString(tmp2));
               // 넘어가자.
               
            }
         } else {
            int j = 7;
            char[] tmp2 = new char[j + 1];
            for (int k = 0; k <= j; k++) {
               tmp2[k] = arr[k][j - k];
            }

         }
      }

      /***
       * 정답란
       */

   }

}