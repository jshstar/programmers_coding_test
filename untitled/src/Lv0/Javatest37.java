package Lv0;
import java.math.BigInteger;
public class Javatest37 { // 두수의 합
    public static void main(String[] args) {
        solution("582",	"734");
    }
    public static String solution(String a, String b) {
        String answer;
        BigInteger intA = new BigInteger(a);
        BigInteger intB = new BigInteger(b);
        BigInteger intC = intA.add(intB);
        answer = intC.toString();
        return answer;
    }
}
