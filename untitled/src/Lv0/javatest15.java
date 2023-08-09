package Lv0;

public class javatest15 { // 문자열 밀기
    public static void main(String[] args) {
        solution("hello", "ohell");
    }
    public static int solution(String A, String B) {
        return (B + B).indexOf(A);
    }

}
