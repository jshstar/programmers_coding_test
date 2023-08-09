package Lv1;

public class javatest11 { // 숫자 문자열과 영단어
    public static void main(String[] args) { //숫자 문자열과 영단어
        solution("one4seveneight");
    }
    public static int solution(String s) {
        int answer = 0;
        String[] englishNum = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        for (int i = 0; i < englishNum.length; i++) {
            if (s.contains(englishNum[i])) {
               s=s.replaceAll(englishNum[i], Integer.toString(i));
                System.out.println(s);
            }
        }
        answer = Integer.parseInt(s);
        return answer;
    }
}
