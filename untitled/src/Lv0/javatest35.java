package Lv0;

public class javatest35 {// 조건 문자열
    public static void main(String[] args) {
        solution("<", "=", 20,50);
    }
    public static int solution(String ineq, String eq, int n, int m) {
        int answer=0;
        if(ineq.equals("<"))
        {
            if(eq.equals("="))
                answer = (n<=m)?1:0;
            else answer = (n<m)?1:0;
        }
        if(ineq.equals(">"))
        {
            if(eq.equals("="))
                answer = (n>=m)?1:0;
            else answer = (n>m)?1:0;
        }
        return answer;
    }
}
