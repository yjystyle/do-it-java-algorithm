package app;

/**
 * TestHsw
 */
public class TestHsw {

    public static void main(String[] args) {
        yjy();
    }

    
    

public static void yjy (){
		      
    int [] budget = new int[]{120,110,140,150}; //지방 예산
    int M = 480; //총 국가 예산
    
    int limit = 0; // 상한액
    int totalBg = 0;  // 지방 총 요청예산
    
    while(limit < 999){
       for(int i = 0; i < budget.length; i++){
          if(budget[i] > limit){ // 상한액보다 클때
             totalBg += limit;
          }else{                // 상한액보다 같거나 작을때
             totalBg += budget[i];
          }
       }
       
       if(totalBg > M){
          limit--;
          break;
       }
       
       totalBg = 0;
       limit++;
    }
    
    System.out.println( limit );
 }
}