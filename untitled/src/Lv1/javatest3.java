package Lv1;

public class javatest3 { // 3진법 뒤집기
    public static void main(String[] args) {
        solution(45);
    }
    public static int solution(int n) {
        int answer;
        String temp;
        String result="";
        temp = Integer.toString(n,3);
        for (int i = temp.length()-1; i >= 0; i--) {
            result += temp.charAt(i);
        }
        answer = Integer.parseInt(result, 3);


        return answer;
    }
}
