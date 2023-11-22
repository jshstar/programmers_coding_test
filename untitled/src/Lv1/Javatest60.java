package Lv1;

public class Javatest60 {// 약수의 개수와 덧샘
	public static void main(String[] args) {
		Javatest60 javatest60 = new Javatest60();
		javatest60.solution(13,17);
	}

	public int solution(int left, int right) {
		int answer = 0;
		int cnt;
		for (int i = left; i <right+1 ; i++) {
			cnt=1;
			for (int j = 1; j <= i/2; j++) {
				if(i%j==0)
					cnt++;
			}
			answer += cnt%2==0? i:-i;
		}
		return answer;
	}

}
