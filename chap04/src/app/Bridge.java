package app;

import java.util.LinkedList;


/**
 * Truck
 */
public class Bridge {

    private int max;
    private int front;
    private int rear;
    private int num;
    private int truckIndex;
    private int time;
    private int weight;
    private int sumOfTrucks;

    private int[] que;

    public Bridge(int bridge_length, int weight) {
        num = front = rear = sumOfTrucks = 0;
        max = bridge_length;
        this.weight = weight;
        try {
            que = new int[max];
        } catch (OutOfMemoryError e) {
            max = 0;
        }
    }

    
    public int enque(int truck) {
        // 길이제약
        if (num >= max) {
            // exception 로직
        }

        // 무게제약
        if (sumOfTrucks + truck > weight){
            // exception 로직
        }


        que[rear++] = truck;
        num++;

        if (rear == max) {
            rear = 0;
        }
        return truck;
    }



    public static void main(String[] args) {
        
        int time = 0;
        int tPtr = 0;
        int bPtr = 0;
        int sumOfTruckWeightInBridge = 0;
        int bridge_length = 2;
        int[] tArr = {7,4,5,6};
        int[] bridge = new int[bridge_length];

        
        while(tPtr < tArr.length){
            


            
            // enBridge
            bridge[bPtr++ % bridge_length] = tArr[tPtr++];



            



            time++;
        }


    }
    
}