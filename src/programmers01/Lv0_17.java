package programmers01;

public class Lv0_17 {
	// 공배수
	
    public int solution(int number, int n, int m) {
        int answer = number % n == 0 && number % m == 0 ? 1 : 0;
        return answer;
    }
}
