package Lv1;

import java.util.Arrays;

public class Javatest33 {
    public static void main(String[] args) { //체육복
        int[] lost = {2, 4};
        int[] reserve = {1, 3, 5};
        solution(5, lost, reserve);

    }
    public static int solution(int n, int[] lost, int[] reserve) {
        int answer = n;
        int cnt =0;
        Arrays.sort(lost);
        Arrays.sort(reserve);
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if(lost[i] == reserve[j]){
                    lost[i] =-1;
                    reserve[j] =-1;
                    cnt++;
                }
            }
        }
        answer = answer - lost.length + cnt;
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if(lost[i]-1 == reserve[j] || lost[i]+1 == reserve[j])
                {
                    answer++;
                    lost[i] =-1;
                    reserve[j] =-1;
                    break;
                }
            }
        }
        return answer;
    }
}
