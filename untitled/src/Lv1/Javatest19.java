package Lv1;

import java.util.ArrayList;
import java.util.List;
public class Javatest19 { // 명예의 전당
    public static void main(String[] args) {
        int[] score={10, 100, 20, 150, 1, 100, 200};
        solution(3, score);
    }
    public static int[] solution(int k, int[] score) {
        int[] answer = new int [score.length];
        List<Integer> list = new ArrayList<>(k);
        list.add(score[0]);
        answer[0] = score[0];
        boolean ck = false;
        for (int i = 1; i < score.length; i++) {
            for (int j = 0; j < list.size(); j++) {
                if(list.get(j)<score[i])
                {
                    list.add(j,score[i]);
                    ck = true;
                    break;
                }
                else ck = false;
            }
            if(ck == false)
                list.add(score[i]);
            if(list.size()>k)
                list.remove(k);
            answer[i] = list.get(list.size()-1);
        }
        return answer;
    }
}
