package Lv0;

public class javatest19 { // 유한소수 판별하기
    public static void main(String[] args) {
        solution(7,20);
    }
    public static int solution(int a, int b) {
        int answer = 0;
        String check;
        check = Double.toString((double)a/b);
        if(check.length() >=15)
            answer =2;
        else
            answer =1;
        return answer;
    }
}
