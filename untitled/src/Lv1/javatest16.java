package Lv1;
import java.util.*;
public class javatest16 { // 가장 가까운 글자
    public static void main(String[] args) {
        String a = "banana";
        solution(a);
    }
    public static int[] solution(String s) {
        int[] answer = new int [s.length()];
        String[] sTemp = s.split("");
        HashMap<String,Integer> map = new HashMap<>();
        int comPo;
        for (int i = 0; i <s.length() ; i++) {
            if(!map.containsKey(sTemp[i]))
            {
                map.put(sTemp[i],i);
                answer[i] = -1;
            }
            else if(map.containsKey(sTemp[i]))
            {
                comPo = map.get(sTemp[i]);
                answer[i] = i - comPo;
                map.put(sTemp[i],i);
            }
        }
        return answer;
    }


}
