package app;

/**
 * Q4
 * 세 값의 대소 관계 13종류의 모든 조합에 대해 중앙값을 구하여 출력하는 프로그램을 작성하세요.
 * 
 */
public class Q4 {

    public static void main(String[] args) {
        

    }

    static int median (int a, int b, int c){
        if (a>=b)
            if (b>=c)
                return b;
            else if ( a<=c)
                return a;
            else 
                return c;
        else if ( a> c) 
            return a;
        else if ( b> c)
            return c;
        else
            return b;   
    }
    
}
