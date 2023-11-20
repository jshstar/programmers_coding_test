package Lv1;

public class Javatest58 { // 수박수박수박수박수박수?
    public static void main(String[] args) {
        Javatest58 javatest58 = new Javatest58();
        javatest58.solution(3);
    }
    public String solution(int n) {
        String answer = "";
        String[] pattern = "수박".split("");
        for (int i = 0; i < n; i++) {
            answer += pattern[i%2];
        }

        return answer;
    }

}
