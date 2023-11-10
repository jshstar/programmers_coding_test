package Lv1;

public class Javatest43 { // 나머지가 1이 되는 수 찾기
    public static void main(String[] args) {
        Javatest43 javatest43 = new Javatest43();
        javatest43.solution(10);
    }
    public int solution(int n) {
        int answer = 0;
        for (int i = 2; i < n; i++) {
            if(n%i ==1)
            {
                answer=i;
                break;
            }
        }
        return answer;
    }
}
