package Lv1;

public class Javatest4 { // 이상한 문자 만들기
    public static void main(String[] args) {
        solution("try hello world");
    }
    public static String solution(String s) {
        String answer = "";
        int cnt = 0;
        char ck;
        for (int i = 0; i <s.length(); i++) {
            ck = s.charAt(i);
            if(ck !=' ')
            {
                if(cnt%2==0) ck = Character.toUpperCase(ck);
                else ck = Character.toLowerCase(ck);
                cnt++;
            }
            else cnt=0;
            answer +=ck;
        }
        return answer;
    }
}
