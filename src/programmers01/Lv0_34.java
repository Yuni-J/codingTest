package programmers01;

public class Lv0_34 {
	// 카운트 업
	
	 public int[] solution(int start_num, int end_num) {
	        int[] answer = new int[end_num - start_num + 1];
	        int count = 0;
	        
	        for(int i = start_num; i <= end_num; i++){
	            answer[count++] = i;
	        }
	           
	        return answer;
	    }

}
