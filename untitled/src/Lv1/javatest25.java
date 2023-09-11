package Lv1;

public class javatest25 {
    public static void main(String[] args) { // 소수만들기
        int[] num = {1,2,7,6,4};
        solution(num);
    }
    public static int solution(int[] nums) {
        int answer = 0;
        int sum;
        boolean flag;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j <nums.length ; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    sum = nums[i]+nums[j]+nums[k];
                    flag =true;
                    for(int l=2;l<sum;l++){
                        if( sum%l == 0 ) {
                            flag = false;
                            break;
                        }
                        else flag =true;
                    }
                    if(flag)
                        answer++;
                }
            }
        }
        return answer;
    }


}
