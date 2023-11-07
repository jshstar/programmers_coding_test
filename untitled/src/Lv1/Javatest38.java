package Lv1;

import java.time.LocalDate;

public class Javatest38 {// 2016년
    public static void main(String[] args) {
        Javatest38 test = new Javatest38();
        System.out.println(test.solution(5,14));
    }
    public String solution(int a, int b) {
        String answer="";
        LocalDate localDate = LocalDate.of(2016,a,b);
        answer = localDate.getDayOfWeek().toString();
        answer= answer.substring(0,3);
        return answer;

    }
}

