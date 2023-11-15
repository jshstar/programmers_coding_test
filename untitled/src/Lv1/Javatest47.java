package Lv1;

public class Javatest47 {
    public static void main(String[] args) { //정수 제곱근 판별
        Javatest47 javatest47 = new Javatest47();
        javatest47.solution(121L);
    }
    public long solution(long n) {
        long answer;
        if(Math.pow((long)Math.sqrt(n),2) == n)
            answer =(long)Math.pow(Math.sqrt(n)+1,2);
        else answer = -1;
        return answer;
    }
}
