package app;


public class Q1 {

    /**
     * 네 값의 최댓값을 구하는 max4 메서드를 작성하세요.
     * 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        System.out.println(max4(44, 44, 21, 50));
    }

    static int max4(int a, int b, int c, int d){
        int max = a;
        if (max < b){
            max = b;
        } 
        if (max < c){
            max = c;
        } 
        if (max < d){
            max = d;
        }
        return max;
    }

}