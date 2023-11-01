package Lv1;

import java.util.*;
public class Javatest14 {
    public static void main(String[] args) { // 두 개 뽑아서 더하기
        int[] numbers = {2,1,3,4,1};
        solution(numbers);
    }
    public static int[] solution(int[] numbers) {
        int[] answer;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j <numbers.length ; j++) {
                set.add(numbers[i]+numbers[j]);
            }
        }
        answer = set.stream().mapToInt(c->c).toArray();
        Arrays.sort(answer);
        // answer = set.stream().sorted().mapToInt(c->c).toArray();
        return answer;
    }
}
