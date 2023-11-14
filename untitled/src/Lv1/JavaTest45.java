package Lv1;

import Lv0.Javatest45;

public class JavaTest45 { //자연수 뒤집어 배열로 만들기
    public static void main(String[] args) {
        JavaTest45 javatest45 = new JavaTest45();
        javatest45.solution(12345L);
    }
    public int[] solution(long n) {
        String[] sTemp = Long.toString(n).split("");
        int[] answer = new int[sTemp.length];
        for (int i = sTemp.length-1; i >=0; i--) {
            answer[sTemp.length-1-i] = Integer.parseInt(sTemp[i]);
        }
        return answer;
    }


}
