package Lv1;
import java.util.*;
public class Javatest22 {
    public static void main(String[] args) {// 과일장수
        int[] score = {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2};
        solution(4,3,score);
    }
    public static int solution(int k, int m, int[] score) {
        int answer = 0;
        Integer[] tempArray = Arrays.stream(score).boxed().toArray(Integer[]::new);
        Arrays.sort(tempArray, Collections.reverseOrder());
        int temp =k, min;
        for (int i = 0; i < tempArray.length; i++) {
            min = Math.min(temp, tempArray[i]);
            temp = tempArray[i];
            if (i % m == m - 1)
            {
                answer += min * m;
                temp =k;
            }
            System.out.println(answer);
        }
        return answer;
    }
}