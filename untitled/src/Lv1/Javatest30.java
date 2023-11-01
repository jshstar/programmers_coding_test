package Lv1;
import java.util.*;
public class Javatest30 {
    public static void main(String[] args) { // 로또의 최고 순위와 최저 순위
        int[] lottos = {44, 1, 0, 0, 31, 25};
        int[] win_nums = {31, 10, 45, 1, 6, 19};
        solution(lottos,win_nums);

    }
    public static int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int cnt=0;
        int same =0;
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < lottos.length; i++) {
            list1.add(lottos[i]);
            list2.add(win_nums[i]);
            if(lottos[i] ==0)
                cnt++;
        }
        for (int i = 0; i < lottos.length; i++) {
            if(list1.contains(list2.get(i)))
                same++;
        }
        answer[0] = Math.min(7-(cnt+same),6);
        answer[1] = Math.min(7-same,6);
        return answer;
    }

}
