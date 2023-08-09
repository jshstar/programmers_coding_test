package Lv0;
import java.util.*;
public class javatest16 { //특이한 정렬
    public static void main(String[] args) {
        int[] unmlist = {1,2,3,4,5,6};
        solution(unmlist,4);
    }
    public static int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        Arrays.sort(numlist);
        int cnt=0;
        Map<Integer, Double> map = new HashMap<>();
        for (int i = 0; i < numlist.length; i++) {
            if(numlist[i]-n<0) map.put(numlist[i],Math.abs(numlist[i]-n)+0.5);
            else map.put(numlist[i],(double)Math.abs(numlist[i]-n));
        }
        List<Integer> keys = new ArrayList<>(map.keySet());
        Collections.sort(keys, (o1, o2) -> (map.get(o1).compareTo(map.get(o2))));
        for (Integer key : keys) {
            answer[cnt] = key;
            cnt++;
        }

        return answer;
    }
}
