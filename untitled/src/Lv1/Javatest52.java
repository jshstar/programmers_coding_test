package Lv1;

public class Javatest52 { // 서울에서 김서방 찾기
    public static void main(String[] args) {
        Javatest52 javatest52 = new Javatest52();
        javatest52.solution(new String[] {"Jane", "Kim"});
    }
    public String solution(String[] seoul) {
        String answer = "";
        int index=0;
        for (int i = 0; i < seoul.length; i++) {
            if(seoul[i].equals("Kim"))
            {
                index = i;
                break;
            }

        }
        return answer = "김서방은 " + Integer.toString(index) + "에 있다";



    }
}
