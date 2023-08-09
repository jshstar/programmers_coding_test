package Lv0;

public class javatest13 { // 다항식 더하기
    public static void main(String[] args) {
        solution("3x + 7 + x");
    }
    public static String solution(String polynomial) {
        String answer = "";
        int xNum = 0;
        int num = 0;
        for (String s: polynomial.split(" ")) {
            if(s.contains("x"))
                xNum += (s.equals("x")) ? 1 : Integer.valueOf(s.replaceAll("x", ""));
            else if (! s.equals("+")) num += Integer.parseInt(s);
        }

        answer =(xNum != 0 ? xNum > 1 ? xNum + "x" : "x" : "")
                + (num != 0 ? (xNum != 0 ? " + " : "")
                + num : xNum == 0 ? "0" : "");


        return answer;
    }
}
