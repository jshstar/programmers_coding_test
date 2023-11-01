package Lv1;

import java.util.*;
public class Javatest34 {
    public static void main(String[] args) { // 완주하지 못한 선수
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};
        solution2(participant,completion);
    }
    public static String solution1(String[] participant, String[] completion) {
        // 초안 작성 코드
        String answer = "";
        for (int i = 0; i < participant.length; i++) {
            for (int j = 0; j < completion.length; j++) {
                if(participant[i].equals(completion[j]))
                {
                    participant[i] =" ";
                    completion[j] = " ";
                    break;
                }
            }
            if(!participant[i].equals(" "))
            {
                answer =participant[i];
                break;
            }
        }
        return answer;
    }
    public static String solution2(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < participant.length; i++) {
            map.put(participant[i],map.getOrDefault(participant[i],0)+1);
        }
        for (int i = 0; i < completion.length; i++) {
            map.put(completion[i],map.getOrDefault(completion[i],0)+1);
        }
        for (String key: map.keySet()) {
            if(map.get(key)%2 ==1)
                answer = key;
        }
        return answer;
    }
}
