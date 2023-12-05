package Lv1;

import java.util.HashMap;
import java.util.Map;

public class Javatest68 { // 달리기 경주
	public static void main(String[] args) {
		Javatest68 javaClass68= new Javatest68();
		javaClass68.solution(new String[]{"mumu", "soe", "poe", "kai", "mine"}
			,new String[]{"kai", "kai", "mine", "mine"});
	}
	public String[] solution(String[] players, String[] callings) {
		String[] answer;
		String temp;
		Map<String, Integer> playerMap = new HashMap<>();
		for (int i = 0; i < players.length; i++) {
			playerMap.put(players[i],i);
		}

		int index;
		for (int i = 0; i < callings.length ; i++) {
			index = playerMap.get(callings[i]);
			if (index !=0){
				// 플레이어 배열 변경
				temp = players[index-1];
				players[index-1] = players[index];
				players[index] =temp;
				// 변경된 위치만큼 playerMap도 위치변경
				playerMap.put(callings[i-1],index-1);
				playerMap.put(players[index],index);
			}
		}
		answer = players;

		return answer;
	}
}
