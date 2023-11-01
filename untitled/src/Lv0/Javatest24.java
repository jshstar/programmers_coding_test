package Lv0;
import java.util.*;
public class Javatest24 { // 직사각형 직사각형 넓이 구하기
    public static void main(String[] args) {
        int[][] dots ={{1,1},{2,1},{2,2},{1,2}};
        solution(dots);
    }
    public static int solution(int[][] dots) {
        int answer = 0;
        double[] length =new double[6];
        int cnt=0;
        double max =0;
        for (int i = 0; i < dots.length; i++) {
            for (int j = i; j < dots.length; j++) {
                if (i != j) {
                    length[cnt] = Math.sqrt(Math.pow(dots[j][0] - dots[i][0], 2) + Math.pow(dots[j][1] - dots[i][1], 2));
                    cnt++;
                }
            }
        }
        Arrays.sort(length);
        answer = (int)(length[0]*length[2]);

        return answer;
    }
}
