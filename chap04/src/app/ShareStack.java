package app;

/**
 * Stackshare
 */
public class ShareStack {

    int ptrA;
    int ptrB;
    int max;
    int[] stk;

    public enum StackType {
        stackA, stackB
    };

    // 실행시 예외 : 스택이 비어 있음
    public class EmptyIntStackException extends RuntimeException {
        public EmptyIntStackException() {
        }
    }

    // 실행시 예외 : 스택이 가득참
    public class OverflowIntStackException extends RuntimeException {
        public OverflowIntStackException() {
        }
    }

    public ShareStack(StackType st, int capacity) {
        ptrA = 0;
        ptrB = capacity - 1;
        max = capacity;
        try {
            stk = new int[max];
        } catch (OutOfMemoryError e) {
            System.out.println("메모리가 없습니다.");
        }
    }

    public int push(StackType st, int x) {
        if (ptrA >= ptrB +1) {
            throw new OverflowIntStackException();
        }
        if (st == StackType.stackA) {
            return stk[ptrA++] = x;
        } else {
            return stk[ptrB--] = x;
        }

    }

    public int pop(StackType st) {
        if (st == StackType.stackA) {
            if (ptrA <= 0) {
                throw new EmptyIntStackException();
            }
            return stk[--ptrA];
        } else {
            if (ptrB >= max - 1) {
                throw new EmptyIntStackException();
            }
            return stk[--ptrB];
        }

    }

}