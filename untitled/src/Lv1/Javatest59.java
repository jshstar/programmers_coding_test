package Lv1;

public class Javatest59 { // 내적
    public static void main(String[] args) {
        Javatest59 javatest59 = new Javatest59();
        javatest59.solution(new int[]{1,2,3,4}, new int[]{-3,-1,0,2});
    }
    public int solution(int[] a, int[] b) {
        int answer = 0;
        for (int i = 0; i < a.length; i++) {
            answer += a[i]*b[i];
        }
        return answer;
    }
}
