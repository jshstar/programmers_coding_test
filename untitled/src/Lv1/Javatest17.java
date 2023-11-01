package Lv1;

public class Javatest17 { //콜라 문제
    public static void main(String[] args) {
        solution(3,2,10);
    }
    public static int solution(int a, int b, int n) {
        int answer = 0;
        int payBackCoke;
        int emptyCoke =n;
        int remainEC;
        while( 0 < emptyCoke/a)
        {
            payBackCoke = emptyCoke/a;
            remainEC = emptyCoke%a;
            emptyCoke = payBackCoke*b + remainEC;
            answer += payBackCoke*b;
        }
        return answer;
    }
}
