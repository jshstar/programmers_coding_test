package Lv1;

import java.util.Arrays;
import java.util.Collections;

public class Javatest48 { // 정수 내림차순으로 배치하기
    public static void main(String[] args) {
        Javatest48 javatest48 = new Javatest48();
        System.out.println(javatest48.solution(118372L));
        System.out.println(javatest48.solution2(118372L));

    }
    public long solution(long n) {
        String sanswer;
        String[] sArray = Long.toString(n).split("");
        Arrays.sort(sArray, Collections.reverseOrder());
        sanswer = String.join("",sArray);
        return Long.parseLong(sanswer);
    }
    public long solution2(long n) {
        String[] sArray = Long.toString(n).split("");
        Arrays.sort(sArray);
        StringBuffer sb = new StringBuffer();
        for(String sArr : sArray)
            sb.append(sArr);
        return Long.parseLong(sb.reverse().toString());
    }
}
