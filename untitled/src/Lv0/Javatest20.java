package Lv0;
import java.util.*;
public class Javatest20 { // 대소문자 바꿔서 출력하기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String result= "";
        for (int i = 0; i < a.length(); i++) {
            char ch= a.charAt(i) - '0'<= 42 ? Character.toLowerCase(a.charAt(i)) : Character.toUpperCase(a.charAt(i));
            result += ch;
        }
        System.out.print(result);

    }
}
