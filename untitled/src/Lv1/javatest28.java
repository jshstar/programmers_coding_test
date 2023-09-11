package Lv1;

public class javatest28 {
    public static void main(String[] args) { // 기사단원의 무기
        solution(10,3,2);
    }
    public static int solution(int number, int limit, int power) {
        int answer = 0;
        int cnt;
        for (int i = 1; i <= number; i++) {
            cnt = 0;
            for (int j = 1; j * j <= i; j++) {
                if (i % j == 0) {
                    cnt++;
                    if (j * j < i)
                        cnt++;
                }
            }
            if(cnt > limit)
                cnt = power;
            answer +=cnt;
        }
        return answer;
    }
}
