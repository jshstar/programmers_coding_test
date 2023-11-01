package Lv2;

public class Javatest2 {
    public static void main(String[] args) {
        solution("3people unFollowed me");
    }
    public static String solution(String s) {
        String answer = "";
        String[] jC = s.toLowerCase().split("");
        for (int i = 0; i < s.length(); i++) {
            if(jC[i].equals(" "))
            {
                if( i+1 != s.length()) {
                    if (!jC[i + 1].equals(" ")) {
                        if (jC[i + 1].compareTo("9") > 7)
                            jC[i + 1] = jC[i+1].toUpperCase();
                    }
                }
            }
            else if(i == 0)
                jC[0]= jC[0].toUpperCase();

            answer += jC[i];
        }
        return answer;
    }
}
