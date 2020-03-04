package app;

import java.util.Arrays;

/**
 * Pbh
 */
public class Pbh {


    public static void main(String[] args) throws Exception {

        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] target = rotateWithAngle(arr, 3, 270);
        System.out.println(Arrays.deepToString(target));
    }

    static int[][] rotateWithAngle(int[][] source, int arrLength, int angle) throws Exception {

        int loopCount = 0;
        switch(angle){ 
            case 90: loopCount = 1; break;
            case 180: loopCount = 2; break;
            case 270: loopCount = 3; break;
            default: throw new Exception("Invalid angle");
        }
        int[][] result = new int[arrLength][arrLength];

        for (int k=0; k < loopCount; k++){
            int[][] target = new int[arrLength][arrLength];
            for (int i = 0; i < source.length; i++) {
                for (int j = 0; j < source[i].length; j++) {
                    target[i][j] = source[2-j][i];
                }
            }
            source = target;
            if (k == loopCount -1){
                result = target;
            }
        }
        return result;
    }

}
