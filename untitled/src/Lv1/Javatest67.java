package Lv1;

public class Javatest67 {
	public static void main(String[] args) {
		Javatest67 javatest67 = new Javatest67();
		javatest67.solution("2022.05.19",new String[]{"A 6", "B 12", "C 3"},new String[]{"Z 3", "D 5"});
	}
	public int[] solution(String today, String[] terms, String[] privacies) {
		int[] answer = {};


		// 다시 풀기
		int[][] privaciesTerms = new int[privacies.length][3];

		// 문제 잘못읽어서 접근을 다시해야한다.
		String[] ymd =today.split(".");
		for (int i = 0; i <privacies.length ; i++) {
			privaciesTerms[i][0]  = Integer.parseInt(ymd[0]);
			privaciesTerms[i][1]= Integer.parseInt(ymd[1]) + Integer.parseInt(terms[i].substring(3));
			if(privaciesTerms)

				privaciesTerms[i][2] = Integer.parseInt(ymd[3]);
		}

		for (int i = 0; i < privacies.length; i++) {
			// String checkToday = today;
			// int[] checkIntToday = intToday;
			// for (int j = 0; j < terms.length; j++) {
			// 	// 약관종류가 같은지 체크
			// 	if(privacies[i].substring(privacies.length-1).equals(terms[j].substring(0,1))){
			// 		checkIntToday[]
			// 	}
			//
			// }
		}



		return answer;
	}
}
