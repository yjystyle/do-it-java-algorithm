package app;

import java.util.Scanner;

/**
 * IntStack
 */
public class IntStack {
    private int max;
    // 0<=ptr<=max;
    private int ptr;
    private int[] stk;

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        IntStack s = new IntStack(64);
        while (true) {
            System.out.println("현재 데이터 수 :" + s.size() + " / " + s.capacity());
            System.out.println("(1)푸시  (2)팝  (3)피크  (4)덤프  (0)종료");
            int menu = stdIn.nextInt();
            if (menu == 0)
                break;

            int x;
            switch (menu) {
                case 1:
                    System.out.println("데이터 : ");
                    x = stdIn.nextInt();
                    try {
                        s.push(x);
                    } catch (IntStack.OverflowIntStackException e) {
                        System.out.println("스택이 가득찼습니다.");
                    }
                    break;
                case 2:
                    try {
                        x = s.pop();
                        System.out.println("팝 데이터는 " + x + "입니다.");
                    } catch (IntStack.EmptyIntStackException e) {
                        System.out.println("스택이 비어있습니다.");
                    }
                    break;
                case 3:
                    try {
                        x = s.peek();
                        System.out.println("피크한 데이터는 " + x + "입니다.");
                    } catch (IntStack.EmptyIntStackException e) {
                        System.out.println("스택이 비어있습니다.");
                    }
                    break;
                
                case 4:
                    s.dump();
                    break;
                    
                    

                  
            }
        }
    }

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

    public IntStack(int capacity) {
        ptr = 0;
        max = capacity;
        try {
            // 스택 본체용 배열을 생성
            stk = new int[max];
        } catch (OutOfMemoryError e) {
            max = 0;
        }
    }

    public int push(int x) throws OverflowIntStackException {
        if (ptr >= max) {
            throw new OverflowIntStackException();
        }
        return stk[ptr++] = x;
    }

    public int pop() throws EmptyIntStackException {
        if (ptr <= 0) {
            throw new EmptyIntStackException();
        }
        return stk[--ptr];
    }

    /**
     * 정상에 있는 데이터를 들여다봄
     * 
     * @return
     * @throws EmptyIntStackException
     */
    public int peek() throws EmptyIntStackException {
        if (ptr <= 0) {
            throw new EmptyIntStackException();
        }
        return stk[ptr - 1];
    }

    public int indexOf(int x) {
        for (int i = ptr - 1; i >= 0; i--) {
            if (stk[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public void clear() {
        ptr = 0;
    }

    public int capacity() {
        return max;
    }

    public int size() {
        return ptr;
    }

    public boolean isEmpty() {
        return ptr <= 0;
    }

    public boolean isFull() {
        return ptr >= max;
    }

    public void dump() {
        if (ptr <= 0) {
            System.out.println("스택이 비어있습니다.");
        } else {
            for (int i = 0; i < ptr; i++) {
                System.out.println(stk[i] + " ");
            }
            System.out.println();
        }
    }
}