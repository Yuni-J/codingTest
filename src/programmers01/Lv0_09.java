package programmers01;

import java.util.Scanner;

public class Lv0_09 {
	// 홀짝 구분하기
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if(n % 2 == 0){
            System.out.print(n + " is even");
        } else {
            System.out.print(n + " is odd");
        }
        
        sc.close();
        
    }

}
