package Lv0;
import java.util.*;
public class Javatest17 { // 전국 대회 선발 고사
    public static void main(String[] args) {
        int[] rank= {3, 7, 2, 5, 4, 6, 1};
        boolean[] attendance = {false, true, true, true, true, false, false};
        solution(rank,attendance);
    }
    public static int solution(int[] rank, boolean[] attendance) {
        Map<Integer, Integer> map = new HashMap<>();
        int cnt =0;
        int[] answer= new int[rank.length];
        for(int i = 0; i < rank.length; i++){
            if(attendance[i])
            {
                map.put(rank[i], i);
                System.out.println(i);
            }
        }
        List<Integer> keySet = new ArrayList<>(map.keySet());
        Collections.sort(keySet);
        for (Integer key : keySet) {
            answer[cnt] = map.get(key);
            cnt++;
        }
        return answer[0] * 10000 + answer[1] * 100 + answer[2];
    }

}
