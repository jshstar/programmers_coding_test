package Lv2;

public class Javatest11 {
	public static void main(String[] args) { // N 개의 최소 공배수
		Javatest11 javatest11 = new Javatest11();
		javatest11.solution(new int[]{2,6,8,14});
	}
	public int solution(int[] arr) {
		int answer = 0;
		if(arr.length == 1){
			return arr[0];
		}
		int g = gcd(arr[0], arr[1]);
		answer = (arr[0] * arr[1]) /g;

		if(arr.length >2){
			for (int i = 0; i < arr.length; i++) {
				g= gcd(answer, arr[i]);
				answer = (answer * arr[i])/g;
			}
		}
		return answer;

	}
	public static int gcd(int a, int b){
		int r = a%b;
		if(r== 0 ) {
			return b;
		} else {
			return gcd(b,r);
		}
	}
}