package app;

import java.util.Scanner;

/**
 * 양의 정수를 입력하고 자릿수를 출력하는 프로그램을 작성하세요.
 * 예를 들어 135를 입력하면 '그 수는 3자리입니다'라고 출력하고, 
 * 1314를 입력하면 '그 수는 4자리입니다.'
 * 라고 출력하면 됩니다.
 */
public class Q11 {

    public static void main(String[] args) {
    
        
        while(true){
            Scanner scan = new Scanner(System.in);
            int input = scan.nextInt();
            String a = String.valueOf(input);
            System.out.println("그 수는 "+a.length() + "자리입니다.");

            
        }


    }

    
    
}