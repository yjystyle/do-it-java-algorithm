package app;

/**
 * 임의의 객체형 데이터를 쌓을 수 있는 제네릭 스택 클래스 Gstack <E> 를 작성하세요.
 */
public class Gstack<E> {
    private int max;
    private int ptr;
    private E[] stk;

    // 실행시 예외 : 스택이 비어 있음
    public static class EmptyIntStackException extends RuntimeException {
        public EmptyIntStackException() {
        }
    }

    // 실행시 예외 : 스택이 가득참
    public static class OverflowIntStackException extends RuntimeException {
        public OverflowIntStackException() {
        }
    }

    @SuppressWarnings("unchecked")
    public Gstack (int capacity){
        ptr = 0;
        max = capacity;
        try {
            stk = (E[]) new Object[max];
        } catch (OutOfMemoryError e) {
           max = 0;
        }
    }

    public E push(E x){
        if (ptr>=max){
            throw new OverflowIntStackException();
        }
        return stk[ptr++] = x;
    }

    public E pop(){
        if (ptr<=0){
            throw new EmptyIntStackException();
        }
        return stk[--ptr];
    }

}