package Lv0;

public class Javatest43 { // 문자열 계산하기
    public static void main(String[] args) {
        solution("3 + 4");
    }
    public static int solution(String my_string) {
        int answer=0;
        String[] s = my_string.split(" ");
        answer += Integer.parseInt(s[0]);
        for (int i = 1; i < s.length-1; i++) {
            if(s[i].equals("+"))
                answer += Integer.parseInt(s[i+1]);
            if(s[i].equals("-"))
                answer -= Integer.parseInt(s[i+1]);
        }
        return answer;
    }
}
