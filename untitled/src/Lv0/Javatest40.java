package Lv0;
import java.util.*;
public class Javatest40 { // 배열만들기 4
    public static void main(String[] args) {
        int[] arr = {1,4,2,5,3};
        solution(arr);
    }
    public static int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        list.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if(list.size() != 0)
            {
                if(list.get(list.size()-1) < arr[i])
                    list.add(arr[i]);
                else
                {
                    list.remove(list.size()-1);
                    i--;
                }
            }
            else list.add(arr[i]);
        }
        int[] stk = list.stream()
                .mapToInt(c -> c)
                .toArray();
        return stk;
    }
}
