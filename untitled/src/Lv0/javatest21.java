package Lv0;
import java.util.*;
public class javatest21 { // 등수 매기기
    public static void main(String[] args) {
        int[][] score = {{80, 70},{90, 50},{40, 70},{50, 80}};
        solution(score);
    }
    public static int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        double[] mean = new double[score.length];
        int rank;
        for (int i = 0; i < score.length; i++) {
            mean[i] = (double)(score[i][0] + score[i][1])/2.0;
        }
        for (int i = 0; i < mean.length; i++) {
            rank=1;
            for (int j = 0; j < mean.length; j++) {
                if(mean[i] < mean[j] && i != j) rank++;
                answer[i] = rank;
            }
        }

        return answer;
    }
}
