package Lv1;

public class Javatest1 {// 최대 공약수와 최소 공배수
    public static void main(String[] args) {
        solution(3,12);
    }
    public static int[] solution(int n, int m) {
        int max=0;
        int min=0;
        for (int i = 1; i<=n && i<=m; i++) {
            if(n%i ==0 && m%i == 0)
                max =i;

        }
        min = (n*m)/max;
        int[] answer ={max,min};
        return answer;
    }
}
