package Lv0;

public class Javatest45 { // 잘라서 배열로 저장하기
    public static void main(String[] args) {
        solution("abc1Addfggg4556b",6);
    }
    public static String[] solution(String my_str, int n) {
        int ck = my_str.length()%n == 0? 0:1;
        String[] answer = new String[my_str.length()/n+ck];
        for (int i = 0; i <my_str.length()/n+ck ; i++) {
            if((i+1)*n<my_str.length())
                answer[i] = my_str.substring(i*n,(i+1)*n);
            else answer[i] = my_str.substring(i*n,my_str.length());
        }
        return answer;
    }
}
