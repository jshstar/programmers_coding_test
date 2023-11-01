package Lv1;
import java.util.*;
public class Javatest5 {// 예산
    public static void main(String[] args) {
        int[] d = {1,3,2,5,4};
        solution(d,9);
    }
    public static int solution(int[] d, int budget) {
        Arrays.sort(d);
        Arrays.sort(d);
        int cnt =0;
        int ck=0;
        for (int i = 0; i < d.length; i++) {
            cnt += d[i];
            if(cnt<=budget)
                ck++;
        }
        return ck;
    }
}
