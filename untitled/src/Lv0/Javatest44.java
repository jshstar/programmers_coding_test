package Lv0;

public class Javatest44 { // qr code
    public static void main(String[] args) {
        solution(3, 1, "qjnwezgrpirldywt");
    }
    public static String solution(int q, int r, String code) {
        String answer = "";
        for (int i = 0; i < code.length(); i++) {
            if(i%q==r)
            {
                answer += code.charAt(i);
            }
        }
        return answer;
    }
}
