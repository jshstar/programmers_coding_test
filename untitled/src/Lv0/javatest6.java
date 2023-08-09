package Lv0;

public class javatest6 { // 연속된 수의 합
    public static void main(String[] args) {
        solution(3, 12);
    }
    public static int[] solution(int num, int total) {
        int[] answer = new int[num];
        int cnt=0;
        int center= total/num;
        if(num%2 != 0)
        {

            int n = (num-1)/2;
            for (int i = center - n; i <= center + n; i++) {
                answer[cnt] = i;
                cnt++;
            }
        }
        else
        {
            int k = num/2 -1;
            for (int i = center-k; i <= center + (total%num); i++) {
                answer[cnt] = i;
                cnt++;
            }
        }
        return answer;
    }
}
