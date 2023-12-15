package Lv2;

public class Javatest4 { //올바른 괄호
    public static void main(String[] args) {
        solution("()()");
    }
    public static boolean solution(String s) {
        boolean answer;
        char[] str = s.toCharArray();
        int cnt=0;
        for (char c : str){
            cnt += c == '(' ? +1 : -1;
            if(cnt < 0)
            {
                answer =false;
                break;
            }
        }
        answer = cnt ==0 ? true:false;
        return answer;
    }
}
