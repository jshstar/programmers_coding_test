package Lv2;

import java.util.Arrays;
import java.util.Stack;

public class Javatest14 {
	public static void main(String[] args) { // 괄호 회전하기
		Javatest14 javatest14 = new Javatest14();
		javatest14.solution("}]()[{");
	}
	public int solution(String s) {
		int answer = 0;

		for (int i = 0; i < s.length(); i++) {
			Stack<Character> stack = new Stack<>();
			String str = s.substring(i, s.length()) + s.substring(0, i);
			for (int j = 0; j < str.length(); j++) {
				char c = str.charAt(j);
				if (stack.isEmpty()) {
					stack.push(c);
				} else if (c == ')' && stack.peek() == '(') {
					stack.pop();
				} else if (c == '}' && stack.peek() == '{') {
					stack.pop();
				} else if (c == ']' && stack.peek() == '[') {
					stack.pop();
				} else {
					stack.push(c);
				}
			}
			if (stack.isEmpty()) {
				answer++;
			}
		}

		return answer;
	}
}
