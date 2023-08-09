package Lv0;

public class javatest38 { // 삼각형의 완성조건(2)
    public static void main(String[] args) {
        int[] sides = {1,2};
        solution(sides);
    }
    public static int solution(int[] sides) {
        int answer = 0;
        int a;
        int b;
        int cnt =0;
        boolean ck1,ck2;
        a = Math.max(sides[0],sides[1]);
        b = Math.min(sides[1],sides[0]);
        for (int i = 1; i <2001 ; i++) {
            ck1 = false;
            ck2 = false;
            if(i<a+b && a<=i)
            {
                cnt++;
                ck1 = true;
            }
            if(a<i+b && i<=a)
            {
                cnt++;
                ck2 = true;
            }
            if(ck1 == true && ck2 == true)
                cnt--;
        }
        answer = cnt;
        return answer;
    }
}
