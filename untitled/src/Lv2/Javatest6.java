package Lv2;

public class Javatest6 { // 숫자의 표현
	public static void main(String[] args) {

	}
	public int solution(int n) {
		int answer = 0;

		for (int i = 1; i <=n; i++) {
			int total =0 ;
			for (int j = i; j <= n; j++) {
				total += j;
				if(total == n){
					answer++;
					break;
				}
				else if(total > n) {
					break;
				}
			}
		}
		return answer;
	}

}
