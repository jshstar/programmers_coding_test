package Lv0;
import java.util.*;
public class Javatest11 { // 최빈값 구하기
    public static void main(String[] args) {
        int[] array ={1,2,3,3,3,4};
        solution(array);
    }
    public static int solution(int[] array) {
        int answer = 0;
        int max = 0;
        Arrays.sort(array);
        int[] check= new int[1000];
        for (int i = 0; i < array.length; i++) {
            check[array[i]]++;
            if(max < check[array[i]])
            {
                max = check[array[i]];
                answer = array[i];
            }
            else if(max == check[array[i]])
            {
                answer = -1;
            }
        }

        return  answer;
    }
}
