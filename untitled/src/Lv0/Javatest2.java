package Lv0;

public class Javatest2 { // 정수를 나선형으로 배치하기
    public static void main(String[] args) {
        solution(4);
    }
    public static int[][] solution(int n) {

        int[][] answer = new int[n][n];
        soultuion sol = new soultuion();
        sol.start=0;
        sol.end=n;
        sol.count =1;
        sol.y =0;
        sol.c =0;
        for (int i = 0; i < 2*n-1; i++) { // 나선으로 도는 경우의수
            switch (i%4)
            {
                case 0:
                    answer = sol.forward(answer);
                    break;
                case 1:
                    answer =sol.down(answer);
                    break;
                case 2:
                    answer =sol.backward(answer);
                    break;
                case 3:
                    answer =sol.up(answer);

                    break;
            }
        }
        return answer;


    }

}


class soultuion{
    int start; // 시작위치
    int end; // 종료위치
    int c; // 현재 열 위치
    int y; // 종료 위치
    int count;
    int temp;

    public int[][] forward(int[][] answer ){ // 정순
        for (int i = start; i < end; i++) {
            answer[y][i] = count;
            count++;
        }
        c = end-1;
        start +=1;
        return answer;
    }
    public int[][] down(int[][] answer){ // 아래
        for (int i = start; i < end; i++) {
            answer[i][c] = count;
            count++;
        }
        y = end-1;

        temp = end;
        end= start-1;
        start = temp-2;
        return answer;
    }
    public int[][] backward(int[][] answer) // 역순
    {   for (int i = start; i >= this.end; i--) {
        answer[y][i] = count;
        count++;
    }
        c= end;
        end +=1;
        return answer;
    }
    public int[][] up(int[][] answer){ // 위로
        for (int i = start; i >= end; i--) {
            answer[i][c] = count;
            count++;
        }
        y= end;
        temp= end;
        end = start+1;
        start = temp;

        return answer;
    }
}
