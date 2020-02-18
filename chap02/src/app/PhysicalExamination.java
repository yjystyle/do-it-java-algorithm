package app;

import java.util.Scanner;

/**
 * PhysicalExamination
 */
public class PhysicalExamination {

    // 시력분포(0.0에서 0.1단위로 21개)
    static final int VMAX = 21;
    static final int IVAL = 10;

    static class PhyscData {
        String name;
        int height;
        double vision;

        PhyscData(String name, int height, double vision){
            this.name = name;
            this.height = height;
            this.vision = vision;
        }
    }

    /**
     * 키 평균 구하기
     * @param dat
     * @return
     */
    static double aveHeight(PhyscData[] dat){
        double sum = 0;
        for (int i=0; i<dat.length; i++){
            sum += dat[i].height;
        }
        return sum/dat.length;
    }

    /**
     * 시력분포 구하기
     * @param dat
     * @param dist
     */
    static void distVision(PhyscData[] dat, int[] dist){
        int i = 0;
        dist[i] = 0;
        for (i=0; i<dat.length; i++){
            if (dat[i].vision> 0.0 && dat[i].vision<=VMAX / (double)IVAL){
                dist[(int) dat[i].vision * IVAL]++;
            }
        }
    }


    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        PhyscData[] x= {
            new PhyscData("박현규", 162, 0.3),
            new PhyscData("황진아", 173, 0.7),
            new PhyscData("최윤지", 175, 2.0),
            new PhyscData("홍연의", 171, 1.5),
            new PhyscData("이수진", 168, 0.4),
            new PhyscData("김영준", 174, 1.2),
            new PhyscData("박영규", 169, 0.8)
        };

        int[] vdList = new int[VMAX];

        System.out.println("신체검사 리스트");
        System.out.println("이름    키    시력");
        System.out.println("------------------");
        for (int i = 0; i <x.length; i++){
            System.out.printf("%-8s%3d%5.1f\n", x[i].name, x[i].height, x[i].vision);
        }
        
        System.out.printf("\n평균 키 : %5.1fcm\n", aveHeight(x));

        distVision(x, vdList);
        System.out.println("\n 시력 분포");
        // for (int i = 0; i <VMAX; i++){
        //     System.out.printf("%3.1f~: %2d명\n", i / (double)IVAL, vdList[i]);
        // }
        // 그래프로
        for (int i=0; i < VMAX; i++){
            if (vdList[i] >0){
                System.out.printf("%3.1f~: ", i/(double)IVAL);
            for (int j=0; j< vdList[i]; j++){
                System.out.printf("*");
            }
            System.out.println();
            } 
        }
     
    }
}