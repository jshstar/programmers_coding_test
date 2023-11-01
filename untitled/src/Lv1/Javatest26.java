package Lv1;

public class Javatest26 {
    public static void main(String[] args) {// 덧칠하기
        int[] section = {2,3,6};
        solution(8,4,section);
    }
    public static int solution(int n, int m, int[] section)
    {
        int answer = 0;
        int start = section[0];
        answer++;
        for (int point: section) {
            if(start + m > point)
                continue; // 페인트칠 범위에 없으면 패스
            start = point;
            answer++;
        }
        return answer;
    }
}
