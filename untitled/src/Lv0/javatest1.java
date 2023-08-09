package Lv0;
import java.util.*;
public class javatest1 { //옹알이(1)
    public static void main(String[] args) {
        String[] a = {"aya", "yee", "u", "maa", "wyeoo"};
        solution(a);
    }
    public static int solution(String[] babbling) {
        String[] baArr = {"aya", "ye", "woo", "ma"}; // 족보
        int[] questResult= {3,2,3,2}; // 족보 문자수
        int answer =0;


        // 검출 시작
        for (String ba: babbling) {
            int resultsize =0;
            int babSize = ba.length();
            if (babSize > 11) { // 클자수 11개 이상 제외
                continue;
            }
            for (int i = 0; i < baArr.length; i++) {
                if(ba.contains(baArr[i]) == true) {
                    resultsize += questResult[i];
                }
            }
            if(resultsize==babSize)
                answer+=1;
        }

        return answer;
    }
}
