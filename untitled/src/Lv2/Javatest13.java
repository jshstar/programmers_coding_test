package Lv2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Javatest13 {
	public static void main(String[] args) {
		Javatest13 javatest13 = new Javatest13();
		javatest13.solution(6, new int[]{1, 3, 2, 5, 4, 5, 2, 3});
	}
	public int solution(int k, int[] tangerine) {
		int sum = 0; // 고를 귤의 개수
		int cnt = 0; // 최솟값 카운트

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int num : tangerine) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}
		ArrayList<Integer> valueList = new ArrayList<>(map.values());
		Collections.sort(valueList, Collections.reverseOrder());
		for (int v : valueList) {
			if (sum + v >= k) {
				cnt++;
				break;
			} else {
				sum += v;
				cnt++;
			}
		}
		return cnt;
	}

}
