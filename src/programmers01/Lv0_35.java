package programmers01;

import java.util.*;

public class Lv0_35 {
	// 콜라츠 수열 만들기

	public int[] solution(int n) {
        List<Integer> result = new ArrayList<>();
        
        while(n != 1){
            result.add(n);
            if(n % 2 == 0){
                n /= 2;
            } else {
                n = 3 * n + 1;
            }
        }
        result.add(1);
        
        int[] answer = new int[result.size()];
        for(int i = 0; i < result.size(); i++){
            answer[i] = result.get(i); 
        }
        
        return answer;
    }

}
