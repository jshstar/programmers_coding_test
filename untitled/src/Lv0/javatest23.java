package Lv0;

public class javatest23 { // 로그인 성공?
    public static void main(String[] args) {
        String[] id_pw = {"meosseugi", "1234"};
        String[][] db = {{"rardss", "123"},{"yyoom", "1234"},{"meosseugi", "1234"}};
        solution(id_pw,db);
    }
    public static String solution(String[] id_pw, String[][] db) {
        String answer = "";
        boolean ck = false;
        for (int i = 0; i < db.length; i++) {
            if(db[i][0].equals(id_pw[0]))
            {

                answer = "wrong pw";
                if(db[i][1].equals(id_pw[1]))
                    answer= "login";
                ck =true;
            }
        }
        if(ck == false)
            answer ="fail";


        return answer;
    }
}
