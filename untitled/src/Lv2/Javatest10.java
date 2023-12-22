package Lv2;

public class Javatest10 {
	public static void main(String[] args) {
		Javatest10 javatest10 = new Javatest10();
		javatest10.solution(8,4,7);
	}
	public int solution(int n, int a, int b)
	{
		int answer = 0;

		while(true){
			a = a/2 + a%2;
			b = b/2 + b%2;
			answer++;
			if(a==b){
				break;
			}
		}
		return answer;
	}
}
