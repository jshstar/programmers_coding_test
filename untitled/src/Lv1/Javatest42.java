package Lv1;

import java.util.Stack;

public class Javatest42 { // 크레인 인형뽑기 게임
    public static void main(String args[])
    {
        Javatest42 javatest42 = new Javatest42();
        int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int[] moves = {1,5,3,5,1,2,1,4};
        javatest42.solution(board,moves);
    }
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack(); // 스텍생성
        for (int i = 0; i < moves.length; i++) { // 이동 순회
            for (int j = 0; j < board.length; j++) { // 이동한 위치에서 인형 뽑는 과정
                if(board[j][moves[i]-1] !=0) // 뽑는 인형이 있을때까지
                {
                    if(!stack.isEmpty()) // 뽑은 인형 저장공간이 비어있지 않으면
                    {
                        if(stack.peek() == board[j][moves[i]-1]) // 이미 쌓여 있는 인형이 같은 인형인지 체크
                        {
                            stack.pop(); // 같은 인형 제거
                            answer +=2; // 제거된 인형수 만큼 +2
                        }
                        else stack.push(board[j][moves[i]-1]); // 같지 않으면 추가
                    }
                    else stack.push(board[j][moves[i]-1]); // 비어있으면 추가
                    board[j][moves[i]-1] =0; // 뽑은 인형자리는 0으로 빈자리 처리
                    break;// 뽑은후 탐색 break
                }
            }
        }
        return answer; // 뽑아서 처리한 인형 총 개수
    }
}
