package Lv0;
import java.util.*;
public class javatest34 { // 배열 만들기 6
    public static void main(String[] args) {
        int arr[] = {0,1,1,1,0};
        solution(arr);
    }
    public static int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length ; i++) {
            if(list.size() == 0) list.add(arr[i]);
            else if (list.size() != 0 && list.get(list.size()-1) == arr[i]) list.remove(list.size()-1);
            else if (list.size() != 0 && list.get(list.size()-1) != arr[i]) list.add(list.size(), arr[i]);
        }
        if(list.size() == 0){
            list.add(-1);
        }
        int[] answer = list.stream()
                .mapToInt(k -> k)
                .toArray();

        return answer;
    }
}
