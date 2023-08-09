package Lv0;

public class javatest18 { // 저주의 숫자 3;
    public static void main(String[] args) {
        solution(15);
    }
    public static int solution(int n) {
        int answer = 1;
        int cnt =1;
        int plCnt=0;
        boolean check;
        while(true){
            check = false;
            if((answer+plCnt)%3 == 0) {
                plCnt++;
                check = true;
            }
            else if(String.valueOf(answer+plCnt).contains("3"))
            {
                check = true;
                plCnt++;
            }
            if(check)
                continue;
            if(cnt == n)
                break;
            cnt++;
            answer++;

        }
        answer +=plCnt;
        return answer;
    }
}
