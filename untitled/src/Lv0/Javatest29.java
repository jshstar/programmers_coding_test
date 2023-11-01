package Lv0;
import java.util.*;
public class Javatest29 { // 무작위로 K개의 수 뽑기
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 2, 2, 3};
        solution(arr,3);
    }
    public static int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        List<Integer> list = new ArrayList<>();
        boolean check;
        list.add(arr[0]);
        int cnt= 1;
        for (int i = 1; i < arr.length; i++) {
            check = false;
            for (int j = 0; j < list.size(); j++) {
                if (list.get(j) == arr[i]) {
                    check =true;
                }
            }
            if(check == false && cnt < k)
            {
                list.add(arr[i]);
                cnt++;
            }

        }
        if(cnt !=k)
        {
            for (int i = cnt; i < k ; i++) {
                list.add(i, -1 );
            }
        }
        answer = list.stream()
                .mapToInt(c -> c)
                .toArray();
        return answer;
    }
}
