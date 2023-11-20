package Lv1;

public class Javatest57 { // 가운데 글자 가져오기
    public static void main(String[] args) {
        Javatest57 javatest57 = new Javatest57();
        javatest57.solution("abcde");
    }

    public String solution(String s) {
        String answer = "";
        if(s.length()%2!=0)
            answer = s.substring(s.length()/2,s.length()/2+1);
        else
            answer = s.substring(s.length()/2-1,s.length()/2+1);
        return answer;
    }
}
