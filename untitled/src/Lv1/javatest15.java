package Lv1;

public class javatest15 { // 푸드 파이트 대회
    public static void main(String[] args) {
        int[] food= {1, 3, 4, 6};
        solution(food);
    }
    public static String solution(int[] food) {
        String answer;
        StringBuffer sb = new StringBuffer();
        String temp="";
        for (int i = 1; i < food.length ; i++) {
            for (int j = 0; j < food[i]/2 ; j++) {
                temp += Integer.toString(i);
            }
        }
        sb.append(temp);
        answer = temp + "0"  + sb.reverse();
        return answer;
    }
}
