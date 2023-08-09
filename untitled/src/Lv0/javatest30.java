package Lv0;

public class javatest30 { // 외계어 사전
    public static void main(String[] args) {
        String[] spell = {"p", "o", "s"};
        String[] dic = {"sod", "eocd", "qixm", "adio", "soo"};
        solution(spell,dic);
    }
    public static int solution(String[] spell, String[] dic) {
        int answer = 0;
        boolean ck;
        boolean ck2 = false;
        int cnt;

        for (int i = 0; i < dic.length; i++) {
            cnt =0;
            for (int j = 0; j < spell.length; j++) {
                if(dic[i].length() == spell.length) {
                    ck = dic[i].contains(spell[j]) ? true : false;
                    if(ck)
                        cnt++;
                }
            }
            if(cnt == spell.length)
                ck2 = true;
        }
        if(ck2)
            answer =1;
        else answer=2;
        return answer;
    }
}
