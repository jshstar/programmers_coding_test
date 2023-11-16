package Lv1;

public class Javatest50 { // 두 정수 사이의 합
    public static void main(String[] args) {
        Javatest50 javatest50 = new Javatest50();

    }
    public long solution(int a, int b) {
        long answer = 0;
        int min = Math.min(a,b);
        int max = Math.max(a,b);
        for (int i = min; i <=max ; i++) {
            answer += i;
        }
        return answer;
    }
}
