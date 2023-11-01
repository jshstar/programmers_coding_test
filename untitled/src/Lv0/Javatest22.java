package Lv0;

public class Javatest22 { // 치킨 쿠폰
    public static void main(String[] args) {
        solution(100);
    }
    public static int solution(int chicken) {
        int answer = 0;
        while (chicken >= 10){
            int service = chicken / 10;
            int savecp = chicken %  10;
            chicken = service + savecp;
            answer += service;
        }


        return answer;
    }
}
