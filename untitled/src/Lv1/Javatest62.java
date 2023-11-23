package Lv1;

public class Javatest62 {// 부족한 금액 계산하기
	public static void main(String[] args) {
		Javatest62 javatest62 = new Javatest62();
		javatest62.solution(3,20,4);
	}
	public long solution(int price, int money, int count) {
		long answer;
		long totalPay=0;
		for (int i = 0; i <count; i++) {
			totalPay += (long)price*(i+1);
		}
		if(money < totalPay)
			answer = totalPay -money;
		else answer =0;
		return answer;
	}


}
