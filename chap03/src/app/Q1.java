package app;

/**
 * Q1
 * 선형 검색 for문
 */
public class Q1 {


    static int seqSearch(int[] a, int key){
        System.out.printf("%3s%2d%3d%3d%3d%3d%3d%3d\n", "|", 0, 1, 2, 3, 4, 5, 6);
        System.out.printf("--+----------------------\n");
        for (int i=0; i<a.length; i++){
            System.out.printf("%3s", "|");
            String format = "%" + (i*3 + 2 )+ "s\n";
            System.out.printf(format, "*");

            System.out.printf("%2d%s",i,"|");
            for (int j=0; j<a.length; j++){
                if (j==0) {
                    System.out.printf("%2d", a[j]);   
                }
                else {
                    System.out.printf("%3d", a[j]);
                }                
            }
            System.out.printf("\n%3s\n", "|");

            if (a[i] == key) {
                return i;
            } 
        }
        return -1;
    }
    


    public static void main(String[] args) {
        int[] arr = {6, 4, 3, 2, 1, 9, 8};
        int result = seqSearch(arr, 8);
        // System.out.println(result);
    }


}