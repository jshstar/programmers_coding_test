package Lv1;

public class javatest7 {// 최소 직사각형
    public static void main(String[] args) {
        int[][] size = {{60, 50},{30,70},{60,30},{80,40}};
        solution(size);
    }
    public static int solution(int[][] sizes) {
        int answer;
        int max,min;
        int sizeMax = 0;
        int sizeMin = 0;
        int[] ck = new int[2];
        for (int i = 0; i < sizes.length; i++) {
            max = Math.max(sizes[i][0],sizes[i][1]);
            min = Math.min(sizes[i][0],sizes[i][1]);
            if(sizeMax <= max) sizeMax = max;
            if(sizeMin <= min) sizeMin = min;
        }
        answer = sizeMax * sizeMin;
        return answer;
    }
}
