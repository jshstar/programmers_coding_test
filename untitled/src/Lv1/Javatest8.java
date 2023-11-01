package Lv1;

public class Javatest8 { //시저 암호
    public static void main(String[] args) {
        solution("AB",1);
    }
    public static String solution(String s, int n) {
        String answer = "";
        char temp;
        for (int i = 0; i < s.length(); i++) {
            temp = s.charAt(i);
            if(temp != ' ')
            {
                if(temp > 96 && temp < 123 && temp + n > 122)
                    temp += n - 122 + 96;
                else if(temp >64 && temp < 91 && temp + n >90 )
                    temp += n - 90 + 64;
                else temp += n;
                answer += temp;
            }
            else answer += ' ';
        }
        return answer;
    }
}
