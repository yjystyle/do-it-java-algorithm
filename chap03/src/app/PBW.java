package app;

import java.util.Arrays;
import java.util.Scanner;

/**
 * PBW
 */
public class PBW {
    public static void main(String[] args) {
        cutTree();
    }

    private static void cutTree() {
        // 1. 입력
        Scanner scan = new Scanner(System.in);
        int treeCount = scan.nextInt();
        int wantLength = scan.nextInt();

        int[] hArr = new int[treeCount];
        for (int i = 0; i < treeCount; i++) {
            hArr[i] = scan.nextInt();
        }

        // 2. 정렬 (asc)
        Arrays.sort(hArr);

        // 3. 정렬 (desc)
        for (int i = 0; i < hArr.length / 2; i++) {
            int tmp = hArr[i];
            hArr[i] = hArr[hArr.length - 1 - i];
            hArr[hArr.length - 1 - i] = tmp;
        }

        // 4. 앞에서 부터 가지치기
        // 나무 높이별로 구간을 나눈다.
        // 20 ~ 17 => 20 -h
        // 16 ~ 15 => 20 + 17 - 2h
        // 14 ~ 10 => 20 + 17 + 10 - 3h
        int max = hArr[0];
        int min = hArr[hArr.length - 1];
        // 나무 절단기
        for (int h = max - 1; h >= min; h--) {
            // 배열 인덱스
            int x = 0;
            int treeSum = 0;
            for (int t = 0; t < hArr.length; t++) {
                if (h >= hArr[t]) {
                    break;
                } else {
                    x++;
                }
                treeSum += hArr[t];
            }
            if (wantLength <= (treeSum - x * h)) {
                System.out.println("절단기 높이 최댓값 : " + h);
                break;
            }

        }
    }
}
