package Lv1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Javatest67 {
	public static void main(String[] args) { // 개인정보 수집기간
		Javatest67 javatest67 = new Javatest67();
		javatest67.solution("2020.01.01",new String[]{"Z 3", "D 5"},new String[]{"2019.01.01 D", "2019.11.15 Z", "2019.08.02 D", "2019.07.01 D", "2018.12.28 Z"});
	}
	// 잘못된 풀이
	public int[] solution(String today, String[] terms, String[] privacies) {

		List<Integer> list = new ArrayList<>();
		HashMap<String,Integer> map = new HashMap<>();
		for(String term : terms ) {
			map.put(term.split(" ")[0], Integer.parseInt(term.split(" ")[1]));
		}
		for (int i = 0; i < privacies.length; i++) {
			for (String key : map.keySet()) {
				if(privacies[i].split(" ")[1].equals(key)){
					int year = Integer.parseInt(privacies[i].substring(0,4));
					int month = Integer.parseInt(privacies[i].substring(5,7)) + map.get(key);
					int day = Integer.parseInt(privacies[i].substring(8,10))-1;
					if(day ==0){
						day = 28;
						month -= 1;
					}
					if(month >12)
					{
						year +=1;
						month -= 12;
					}
					int[] thisToday = new int[3];
					thisToday[0] = Integer.parseInt(today.substring(0,4));
					thisToday[1] = Integer.parseInt(today.substring(5,7));
					thisToday[2] = Integer.parseInt(today.substring(8,10));
					if(thisToday[0] <= year){
						if(thisToday[1] <= month){
							if(thisToday[2]<=day){
								continue;
							}else list.add(i+1);
						}else list.add(i+1);
					}
					else list.add(i+1);
				}
			}
		}
		int[] answer = list.stream().mapToInt(i->i).toArray();

		return answer;
	}

	// 정답 풀이
	int len;
	public int[] solution2(String today, String[] terms, String[] privacies) {
		//파기해야 할 개인정보 번호를 오름차순 정렬해서 리턴할것.
		len = privacies.length;

		HashMap<String, Integer> terM = new HashMap<>();
		int[] expireT = new int[len];

		ArrayList<Integer> list = new ArrayList<>();
		int now = getDays(today);
		for(String x : terms){
			terM.put(x.split(" ")[0], Integer.parseInt(x.split(" ")[1]) * 28);
		}

		for(int i =0 ;i < len ;i++){
			int day = getDays(privacies[i].split(" ")[0]);
			String key = privacies[i].split(" ")[1];
			expireT[i] = day + terM.get(key);
			//System.out.println(now+","+expireT[i]);
			if(expireT[i] <= now){
				list.add(i+1);
			}
		}
		return list.stream().mapToInt(x->x).toArray();
	}
	public int getDays(String x){
		int y = Integer.parseInt(x.split("\\.")[0]);
		int m = Integer.parseInt(x.split("\\.")[1]);
		int d = Integer.parseInt(x.split("\\.")[2]);

		return d + m * 28 + (y-2000) * 12 * 28;
	}
}
