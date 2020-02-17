package app;

/**
 * 직각 이등병 삼각형 출력
 */
public class Q15 {

    public static void main(String[] args) {
        
    
        triangleLB(4);
        triangleRU(4);
        triangleRB(4);

    }

    static void triangleRB(int n) {
        for(int i=1; i<=n; i++){
              
            for(int j=n; j>i; j--){
                System.out.print(" ");
            }

            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
          
            System.out.println();
        }
    }

    static void triangleRU(int n) {
        for(int i=0; i<=n; i++){
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }
            for(int j=n; j>i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void triangleLB(int n) {
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}