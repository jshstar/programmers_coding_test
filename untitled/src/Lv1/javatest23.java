package Lv1;
import java.util.*;
public class javatest23 {// 모의고사
    public static void main(String[] args) {
        int[] answer = {1,2,3,4,5};
        solution(answer);
    }
    public static int[] solution(int[] answers) {
        int[] answer;
        int[] supo1 ={1, 2, 3, 4, 5};
        int[] supo2 ={2, 1, 2, 3, 2, 4, 2, 5};
        int[] supo3 ={3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] ans = new int[3];
        List<Integer> list = new ArrayList<>();
        int max;
        //1번 12345
        //2번 21232425
        //3번 3311224455
        for (int i = 0; i < answers.length; i++) {
            if(answers[i] == supo1[i%supo1.length])
                ans[0]++;
            if(answers[i] == supo2[i%supo2.length])
                ans[1]++;
            if(answers[i] == supo3[i%supo3.length])
                ans[2]++;
        }
        max = Math.max(Math.max(ans[0],ans[1]),ans[2]);
        if(max == ans[0])
            list.add(1);
        if(max == ans[1])
            list.add(2);
        if(max == ans[2])
            list.add(3);
        answer = list.stream().mapToInt(c->c).toArray();
        return answer;
    }
}
