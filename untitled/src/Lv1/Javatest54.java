package Lv1;

public class Javatest54 { //음양 더하기
    public static void main(String[] args) {

    }
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for (int i = 0; i < absolutes.length; i++) {
            answer += signs[i]? absolutes[i]: -absolutes[i];
        }
        return answer;
    }

}
