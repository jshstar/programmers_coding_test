package Lv1;
import java.util.*;
public class javatest2 { // 같은 숫자는 싫어
    public static void main(String[] args) {
        int[] arr = {1,1,3,3,0,1,1};
        solution(arr);
    }
    public static int[] solution(int []arr) {
        List<Integer> list = new ArrayList();
        int ck =arr[0];
        list.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if(ck != arr[i])
                list.add(arr[i]);
            ck = arr[i];
        }
        int[] answer = list.stream().mapToInt(c ->c).toArray();
        return answer;
    }
}
