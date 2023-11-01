package Lv0;

public class Javatest12 { //코드 처리하기
    public static void main(String[] args) {
        solution("abc1abc1abc");
    }
    public static String solution(String code) {
        String answer = "";
        boolean mode = false;
        for (int i = 0; i < code.length(); i++) {
            if(code.charAt(i) =='1')
                mode = (mode == false) ? true : false;
            else if(mode == false && i % 2 == 0 && code.charAt(i) != '1')
                answer += code.charAt(i);
            else if(mode == true && i % 2 == 1 && code.charAt(i) != '1')
                answer += code.charAt(i);
        }
        if(answer=="")
            answer = "EMPTY";
        return answer;
    }
}
