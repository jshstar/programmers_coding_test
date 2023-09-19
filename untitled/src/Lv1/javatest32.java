package Lv1;
import java.util.*;
public class javatest32 { // 숫자 짝궁
    public static void main(String[] args) {
        solution1("5525", "1255");
    }
    public static String solution1(String X, String Y) {
        //초안코드
        String answer = "";
        String[] s1 = X.split("");
        String[] s2 = Y.split("");
        StringBuilder sb = new StringBuilder();
        Arrays.sort(s1,Collections.reverseOrder());
        boolean flag= false;
        for (int i = 0; i < s1.length; i++) {
            for (int j = 0; j < s2.length ; j++) {
                if(s1[i].equals(s2[j]))
                {
                    if(!s2[j].equals("0"))
                        flag = true;
                    sb.append(s2[j]);
                    s2[j] = "-1";
                    break;
                }
            }
        }
        if(!sb.toString().isEmpty())
        {
            if(flag) answer = sb.toString();
            else answer ="0";
        }
        else answer ="-1"; // 시간복잡도 문제 발견
        return answer;
    }
    public static String solution2(String X, String Y) {
        String answer = "";
        int[] xArray = new int[10];
        int[] yArray = new int[10];
        boolean flag = false;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < X.length(); i++) {
            xArray[X.charAt(i) - 48] += 1;
        }
        for (int i = 0; i < Y.length(); i++) {
            yArray[Y.charAt(i) - 48] += 1;
        }

        for (int i = xArray.length-1; i >= 0; i--) {
            if(xArray[i] > 0 && yArray[i] > 0)
            {
                if(i > 0) flag =true;
                for (int j = 0; j < Math.min(xArray[i],yArray[i]); j++) {
                    sb.append(i);
                }
            }
        }
        if(!sb.toString().isEmpty())
        {
            if(flag) answer = sb.toString();
            else answer = "0";
        }
        else answer = "-1";
        return answer;
    }
}
