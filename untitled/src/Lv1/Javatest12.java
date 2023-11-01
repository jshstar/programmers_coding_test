package Lv1;

import java.util.*;

public class Javatest12 { // 문자열 내마음대로 정렬하기
    public static void main(String[] args) {
        String[] a = {"sun", "bed", "car"};
        solution(a,1);
    }
    public static String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        for (int i = 0; i < strings.length; i++){
            String first = strings[i].substring(n,n+1);
            strings[i] = first + strings[i];
        }
        Arrays.sort(strings);
        for (int i = 0; i < strings.length; i++) {
            strings[i] = strings[i].substring(1);
            answer[i] = strings[i];
        }
        return answer;
    }
}
