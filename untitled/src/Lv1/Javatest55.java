package Lv1;

public class Javatest55 { // 핸드폰 번호 가리기
    public static void main(String[] args) {
        Javatest55 javatest55 = new Javatest55();
        javatest55.solution("027778888");
    }
    public String solution(String phone_number)
    {
        String answer="";
        for (int i = 0; i < phone_number.length()-4; i++) {
            answer += "*";
        }
        answer += phone_number.substring(phone_number.length()-4);

        return answer;
    }
}
