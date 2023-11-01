package Lv2;

public class Javatest1 {
    public static void main(String[] args) {

    }
    public String solution(String s) {
        String answer;
        String[] arrayS;
        arrayS = s.split(" ");
        int max = Integer.parseInt(arrayS[0]);
        int min = Integer.parseInt(arrayS[0]);
        for (int i = 0; i < arrayS.length; i++) {
            max = Math.max(max,Integer.parseInt(arrayS[i]));
            min = Math.min(min, Integer.parseInt(arrayS[i]));
        }
        answer = Integer.toString(min) + " " + Integer.toString(max);
        return answer;
    }

}
