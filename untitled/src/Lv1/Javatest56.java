package Lv1;

public class Javatest56 {// 없는 숫자 더하기
    public static void main(String[] args) {
        Javatest56 javatest56 = new Javatest56();
        javatest56.solution(new int[]{1,2,3,4,6,7,8,0});
    }
    public int solution(int[] numbers) {
        int answer = 45;
        for (int i = 0; i < numbers.length; i++) {
            answer -=numbers[i];
        }

        return answer;
    }

}
