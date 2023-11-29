package Lv1;

import java.util.Arrays;

public class Javatest65 { // 성격 유형 검사하기
	public static void main(String[] args) {
		Javatest65 javatest65 = new Javatest65();
		javatest65.solution(new String[]{"AN", "CF", "MJ", "RT", "NA"}, new int[]{5, 3, 2, 7, 5});
	}
	public String solution(String[] survey, int[] choices) {
		String answer = "";
		int scoreR = 0, scoreC = 0, scoreJ = 0, scoreA = 0,
			scoreT = 0, scoreF = 0, scoreM = 0, scoreN = 0;
		for (int i = 0; i < survey.length; i++) {

			String type = survey[i].substring(0,1);
			if(choices[i] > 4) type= survey[i].substring(1,2);
			int score = Math.abs(choices[i] -4);
			switch (type){
				case "R": scoreR += score; break;
				case "T": scoreT += score; break;
				case "C": scoreC += score; break;
				case "F": scoreF += score; break;
				case "J": scoreJ += score; break;
				case "M": scoreM += score; break;
				case "A": scoreA += score; break;
				case "N": scoreN += score; break;
			}
		}

		String[] userType = {"R","C","J","A"};
		if(scoreR < scoreT) userType[0]= "T";
		if(scoreC < scoreF) userType[1]= "F";
		if(scoreJ < scoreM) userType[2]= "M";
		if(scoreA <  scoreN) userType[3]= "N";
		answer = userType[0]+userType[1]+ userType[2]+userType[3];
		return answer;
	}

}
