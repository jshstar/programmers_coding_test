package Lv2;

public class Javatest9 { // 카펫
	public static void main(String[] args) {
		Javatest9 javatest9 = new Javatest9();
		javatest9.solution(10,2);
	}
	public int[] solution(int brown, int yellow) {
		int[] answer = new int[2];
		for (int i = 1; i <= yellow; i++) {
			int yellowWidth = Math.max(i, yellow/i);
			int yellowHeight = Math.min(i, yellow/i);

			int answerWidth = yellowWidth + 2;
			int answerHeight = yellowHeight + 2;
			if((answerWidth + answerHeight) * 2 - 4 == brown && answerHeight * answerWidth == brown + yellow ){
				answer[0] = answerWidth;
				answer[1] = answerHeight;
				break;
			}
		}
		return answer;
	}
}
