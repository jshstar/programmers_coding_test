package Lv1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Javatest39 {//제일 작은수 제거하기
    public static void main(String[] args) {
        Javatest39 code = new Javatest39();
        code.solution(new int[]{4,3,2,1});
    }
    public int[] solution(int[] arr){
        int[] answer;
        List<Integer> list= new ArrayList<>();
        if(arr.length ==1)
            answer = new int[]{-1};
        else{
            for (int i = 0; i < arr.length; i++) {
                list.add(arr[i]);
            }
            list.remove(Collections.min(list));
            answer = list.stream().mapToInt(i->i).toArray();
        }
        return answer;
    }
}
