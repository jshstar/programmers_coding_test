package Lv1;

import java.util.Arrays;
import java.util.Collections;

public class Javatest61 { // 문자열 내림차순으로 배치하기
	public static void main(String[] args) {
		Javatest61 javatest61 = new Javatest61();
		javatest61.solution("Zbcdefg");
	}

	public String solution(String s) {
		String answer = "";
		String[] sArr = s.split("");
		Arrays.sort(sArr, Collections.reverseOrder());
		for (String a : sArr) {
			answer += a;
		}
		return answer;
	}

}
