package Lv1;

public class Javatest63 { // 문자열 다루기 기본
	public static void main(String[] args) {

	}
	public boolean solution(String s) {
		boolean answer = true;
		if (s.length() == 4 || s.length() == 6){
			for (int i = 0; i < s.length(); i++) {
				char a= s.charAt(i);
				if(a>'9'){
					answer = false;
					break;
				}
			}
		}
		else answer = false;

		return answer;
	}
}
