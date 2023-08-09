package Lv1;

import java.util.Arrays;

public class javatest13 {
    public static void main(String[] args) {//k번째수
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands ={{2, 5, 3},{4, 4, 1},{1, 7, 3}};
        solution(array,commands);

    }
    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int [commands.length];
        for (int i = 0; i < commands.length ; i++) {
            int[] temp = new int [commands[i][1] -commands[i][0]+1];
            int cnt=0;
            for (int j = commands[i][0]-1; j < commands[i][1] ; j++) {
                temp[cnt] = array[j];
                cnt++;
            }
            Arrays.sort(temp);
            answer[i] = temp[commands[i][2]-1];
        }
        return answer;
    }

}
