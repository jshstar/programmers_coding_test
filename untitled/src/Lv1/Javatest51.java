package Lv1;

public class Javatest51 {// 콜라츠 추측
    public static void main(String[] args) {
        Javatest51 javatest51 = new Javatest51();
        javatest51.solution(16);
    }
    public int solution(int num) {
        int answer;
        int cnt =0;
        long lNum=num;
        while(cnt <501)
        {
            if(lNum ==1)
                break;
            else if(lNum%2==0)
                lNum /=2;
            else lNum =lNum*3+1;
            cnt++;
        }
        if(cnt == 501)
            answer =-1;
        else if (cnt == 0)
            answer =0;
        else answer =cnt;
        return answer;
    }
}
