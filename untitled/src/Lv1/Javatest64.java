package Lv1;

import java.util.Arrays;

public class Javatest64 {
	public static void main(String[] args) { // 햄버거 만들기
		Javatest64 javatest64 = new Javatest64();
		javatest64.solution2(new int[] {2, 1, 1, 2, 3, 1, 2, 3, 1});
	}

	public int solution(int[] ingredient) {
		int answer = 0;
		// 빵 야채 고기 빵 1 2 3 1
		StringBuffer sb = new StringBuffer();
		for (int num : ingredient) {
			sb.append(num);
		}
		while (true) {
			if (sb.indexOf("1231") == -1)
				break;
			sb.delete(sb.indexOf("1231"),sb.indexOf("1231")+4);
			answer++;
		}
		return answer;
	}

	public int solution2(int[] ingredient) {
		int answer = 0;
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < ingredient.length; i++) {
			sb.append(ingredient[i]);
			if (sb.length() > 3 && sb.subSequence(sb.length() - 4, sb.length()).equals("1231")) {
				sb.delete(sb.length() - 4, sb.length());
				answer++;
			}
		}
		return answer;
	}

}
