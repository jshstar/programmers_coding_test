package Lv0;

public class javatest41 { // 문자 개수 세기
    public static void main(String[] args) {
        solution("Programmers");
    }
    public static int[] solution(String my_string) {
        int[] answer = new int[52];
        char ck;
        String s;
        String  a = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < my_string.length(); i++) {
            ck = my_string.charAt(i);
            s = String.valueOf(ck);
            answer[a.indexOf(s)] += 1;
        }
        return answer;
    }
}
