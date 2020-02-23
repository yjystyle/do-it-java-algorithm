package app;

/**
 * Q16
 */
public class Q16 {

    
    public static void main(String[] args) {

        spira(4);
    }

    static void spira(int n){
        for(int i=1; i<=n; i++){
            for(int j=n-i; j>0; j--){
                System.out.print(" ");
            }
            for (int j=1; j<=2*i-1; j=j+1){
               System.out.print("*"); 
            }

            // for(int  j=n-i; j>0; j--){
            //     System.out.print(" ");
            // }
            System.out.println();
        }
    }
}