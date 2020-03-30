package app;

/**
 * IntQueue
 */
public class IntQueue {

    private int max;
    private int front;
    private int rear;
    // 현재 데이터 수
    private int num;
    private int[] que;

    public class EmptyIntQueueException extends RuntimeException {
        public EmptyIntQueueException() {
        }
    }

    public class OverflowIntQueueException extends RuntimeException {
        public OverflowIntQueueException() {
        }
    }

    public IntQueue(int capacity) {
        num = front = rear = 0;
        max = capacity;
        try {
            que = new int[max];
        } catch (OutOfMemoryError e) {
            max = 0;
        }
    }

    public int enque(int x) {
        if (num >= max) {
            throw new OverflowIntQueueException();
        }
        que[rear++] = x;
        num++;
        if (rear == max) {
            rear = 0;
        }
        return x;
    }

}