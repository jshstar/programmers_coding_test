package Lv2;

import java.util.Arrays;

public class Javatest16 { // H-Index
	public static void main(String[] args) {
		Javatest16 javatest16 = new Javatest16();
		javatest16.solution(new int[]{3, 0, 6, 1, 5});
	}
	public int solution(int[] citations) {
		int answer = 0;
		Arrays.sort(citations);
		for (int i = 0; i < citations.length; i++) {
			int hIndex = citations.length -i;
			if(citations[i] >= hIndex) {
				answer = hIndex;
				break;
			}
		}
		return answer;
	}

}
