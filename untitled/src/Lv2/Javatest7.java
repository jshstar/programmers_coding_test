package Lv2;

public class Javatest7 { // 다음 큰 숫자
	public static void main(String[] args) {
		Javatest7 javatest7 = new Javatest7();
		javatest7.solution(78);
	}
	public int solution(int n) {
		int answer;
		int oneNCnt=0;
		int checkOneCnt;
		String bS = Integer.toBinaryString(n);
		for (int i = 0; i < bS.length(); i++) {
			if(bS.charAt(i) == '1'){
				oneNCnt++;
			}
		}
		while(true){
			n +=1;
			checkOneCnt =0;
			String checkBS = Integer.toBinaryString(n);
			for (int i = 0; i <checkBS.length(); i++) {
				if(checkBS.charAt(i) == '1'){
					checkOneCnt++;
				}
			}
			if(oneNCnt == checkOneCnt){
				answer = n;
				break;
			}
		}
		return answer;
	}

}
