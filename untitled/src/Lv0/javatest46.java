package Lv0;
import java.util.*;
public class javatest46 { // 2의 영역
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 4, 5, 2, 9};
        solution(arr);
    }
    public static int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        List<Integer> range = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] ==2)
                range.add(i);
        }
        if(range.size() >1)
        {
            for (int i = range.get(0); i <range.get(range.size()-1)+1; i++) {
                list.add(arr[i]);
            }
        }
        else if(range.size() == 1)
            list.add(2);
        else if (range.size()==0)
            list.add(-1);
        int[] answer = list.stream().mapToInt(c -> c).toArray();
        return answer;
    }
}
