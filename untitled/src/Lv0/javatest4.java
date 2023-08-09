package Lv0;

public class javatest4 {
    public static void main(String[] args) { //겹치는 선분의 길이
        int[][] lines = {{0,1},{2,5},{3,9}};
        solution(lines);
    }
    public static int solution(int[][] lines) {
        int answer = 0;
        for (int i = -100; i <=100 ; i++) {
            int check =0;
            if(lines[0][0]<i&&i<=lines[0][1])
                check++;
            if(lines[1][0]<i&&i<=lines[1][1])
                check++;
            if(lines[2][0]<i&&i<=lines[2][1])
                check++;
            if(check>1)
                answer++;
        }
        return answer;
    }
}
