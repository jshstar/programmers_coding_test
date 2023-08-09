package Lv0;
import java.util.*;
public class javatest36 { // 왼쪽 오른쪽
    public static void main(String[] args) {
        String[] str_list = {"u", "u", "l", "r"};
        solution(str_list);
    }
    public static String[] solution(String[] str_list) {
        String[] answer = {};
        List<String> list = new ArrayList();
        boolean lck =false;
        boolean rck =false;
        for (String key: str_list) {
            if(key.equals("l") && lck == false)
            {
                answer = list.toArray(new String[list.size()]);
                lck =true;
                break;
            }
            else if(key.equals("r") && rck ==false)
            {
                list.clear();
                rck = true;
                lck =true;
            }
            else if (rck ==true)
            {
                list.add(key);
                answer = list.toArray(new String[list.size()]);
            }
            else list.add(key);
        }
        if(lck == false && rck == false)
        {
            list.clear();
            answer= list.toArray(new String[list.size()]);
        }

        return answer;
    }
}
