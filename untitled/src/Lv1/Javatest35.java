package Lv1;

public class Javatest35 {
    public static void main(String[] args) { // 문자열 나누기
        solution("banana");
    }
    public static int solution(String s) {
        int answer = 1;
        char x = s.charAt(0);
        int cnt =1;
        for (int i = 1; i < s.length(); i++) {
            if(cnt ==0)
            {
                answer++;
                x= s.charAt(i);
            }
            if(x == s.charAt(i)) cnt++;
            else cnt--;
        }
        return answer;
    }
}
