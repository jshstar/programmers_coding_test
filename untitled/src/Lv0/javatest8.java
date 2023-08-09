package Lv0;

public class javatest8 { // 다음에 올 숫자
    public static void main(String[] args) {
        int[] common = {1,2,3,4};
    }
    public int solution(int[] common) {
        int answer=0;
        int check1 = common[1]- common[0];
        int check2 = common[2]- common[1];
        if(check2 == check1) //등차
        {
            answer= common[common.length-1]+check1;

        }
        else
        {
            int r = common[1]/common[0];
            answer = common[common.length-1]*r;
        }

        return answer;
    }
}
