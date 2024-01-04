package Lv2;

public class Javatest17 {//n^2 배열 자르기
	public static void main(String[] args) {
		Javatest17 javatest17 = new Javatest17();
		javatest17.solution(3, 2, 5);
	}
	public int[] solution(int n, long left, long right) {
		int[] answer = new int[(int)(right - left + 1)];
		int idx = 0;
		for (long i = left; i <= right; i++) {
			long row = i / n;
			long col = i % n;
			answer[idx++] = Math.max((int)row, (int)col) + 1;
		}
		return answer;
	}
}
