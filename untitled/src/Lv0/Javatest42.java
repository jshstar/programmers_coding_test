package Lv0;

public class Javatest42 { //영어가 싫어요
    public static void main(String[] args) {
        solution("onetwothreefourfivesixseveneightnine");
    }
    public static long solution(String numbers) {
        long answer;
        char a;
        String sTemp = "";
        String sAnswer = "";
        String[][] sNum = {{"zero","one","two","three","four","five"
                ,"six","seven","eight","nine"},
                {"0","1","2","3","4","5","6","7","8","9"}};
        for (int i = 0; i < numbers.length(); i++) {
            a = numbers.charAt(i);
            sTemp += String.valueOf(a);
            for (int j = 0; j < 10; j++) {
                if(sTemp.equals(sNum[0][j]))
                {
                    sAnswer += sNum[1][j];
                    sTemp = "";
                }
            }
        }
        answer =  Long.parseLong(sAnswer);
        return answer;
    }
}
