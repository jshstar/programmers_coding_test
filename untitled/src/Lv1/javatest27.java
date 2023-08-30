package Lv1;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.*;
public class javatest27 {
    public static void main(String[] args) {
        int[] stages = {1,1,1,1};
        solution(2,stages);
    }
    public static int[] solution(int N, int[] stages) {
        HashMap<Integer, Double> map= new HashMap<>();
        for (int i = 1; i <=N ; i++) {
            if(i<=N)
                map.put(i,0.0);
        }
        for (int i = 0; i < stages.length; i++) {
            if(stages[i]<=N)
                map.put(stages[i],map.getOrDefault(stages[i],0.0)+1);
        }
        double cnt = map.get(1);
        double temp;
        map.put(1, map.get(1)/(stages.length));
        for (int i = 2; i <= map.size(); i++) {
            temp = map.get(i);
            if(cnt != stages.length)
            {
                map.put(i,map.get(i)/((double)stages.length-cnt));
                cnt += temp;
            }
            else map.put(i,0.0);
        }
//        for (int i = 1; i <= map.size(); i++) {
//            System.out.println(i + ":" + map.get(i));
//        }
        List<Integer> list = new ArrayList<>(map.keySet());
        list.sort((o1, o2) -> map.get(o2).compareTo(map.get(o1)));
        int[] answer =  list.stream().mapToInt(Integer::intValue).toArray();
//        for (int i = 0; i < answer.length; i++) {
//            System.out.println(answer[i]);
//        }
        return answer;
    }
}
