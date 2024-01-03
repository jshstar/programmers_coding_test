package Lv2;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class Javatest15 { // 연속 부분 수열 합의 개수
	public static void main(String[] args) {
		Javatest15 javatest15 = new Javatest15();
		javatest15.solution(new int[]{7,9,1,1,4});
	}
	public int solution(int[] elements) {
		int answer = 0;
		Set<Integer> set = new HashSet<>();
		int start = 1;
		while (start <= elements.length){

			for (int i = 0; i < elements.length; i++) {
				int value =0;
				for (int j = i; j < i+start ; j++) {
					value += elements[j % elements.length];
				}
				set.add(value);
			}
			start++;
		}
		answer = set.size();
		return answer;
	}


}
