package Lv0;

public class javatest28 { // 문자열 겹쳐쓰기
    public static void main(String[] args) {
        solution("He11oWor1d","lloWorl",2 );
    }
    public static String solution(String my_string, String overwrite_string, int s) {
        String answer;
        StringBuffer sb = new StringBuffer();
        sb.append(my_string);
        sb.delete(s,overwrite_string.length()+s);
        sb.insert(s,overwrite_string);
        answer = sb.toString();
        return answer;
    }
}
