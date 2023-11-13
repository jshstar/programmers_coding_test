package Lv1;

public class Javatest44 { // x만큼 간격이 있는 n개의 숫자

    public static void main(String[] args) {
        Javatest44 javatest44 = new Javatest44();
        javatest44.solution(2,5);
    }
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        for (int i = 0; i < n; i++) {
            answer[i] = (long)(i+1)*x;
        }
        return answer;
    }
}
