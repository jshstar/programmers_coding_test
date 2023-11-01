package Lv1;

public class Javatest9 { // 크기가 작은 부분물자열
    public static void main(String[] args) {
        solution("3141592",	"271");
    }
    public static int solution(String t, String p) {
        String[] s = t.split("");
        String temp;
        int answer =0;
        long[] ck = new long[2];
        ck[1] = Long.parseLong(p);
        for (int i = 0; i < s.length; i++) {
            temp="";
            if(i+p.length()-1< t.length()){
                for (int j = i; j < i+p.length(); j++) {
                    temp += s[j];
                }
                ck[0]= Long.parseLong(temp);
                if(ck[0] <= ck[1])
                    answer++;
            }
        }
        return answer;
    }
}
