package Lv1;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Javatest53 { // 나누어 떨어지는 숫자 배열
    public static void main(String[] args) {
        Javatest53 javatest53 = new Javatest53();
        javatest53.solution(new int[]{5, 9, 7, 10}, 5);
    }
    public int[] solution(int[] arr, int divisor) {
        int[] answer;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%divisor ==0)
                list.add(arr[i]);
        }
        if(list.isEmpty())
            list.add(-1);
        answer = list.stream().mapToInt(i->i).sorted().toArray();

        return answer;
    }
}
