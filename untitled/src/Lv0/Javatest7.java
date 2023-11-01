package Lv0;

public class Javatest7 { // 분수의 덧샘
    public static void main(String[] args) {
        solution(1,2,3,4);
    }
    public static int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int resultNumer= numer1 * denom2 + numer2 * denom1;
        int resultDenom= denom1 * denom2;

        int k = (resultDenom<resultNumer) ?  resultDenom : resultNumer;
        for (int i = k; i>0 ;i--) {
            if(resultNumer%i==0 && resultDenom%i ==0)
            {
                resultNumer/=i;
                resultDenom/=i;
            }
        }
        answer[0] = resultNumer;
        answer[1] = resultDenom;


        return answer;
    }
}
