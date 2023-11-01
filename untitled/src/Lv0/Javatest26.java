package Lv0;

public class Javatest26 { // 캐릭터의 좌표
    public static void main(String[] args) {
        String[] keyinput ={"left", "right", "up", "right", "right"};
        int[] bord = {11,11};
        solution(keyinput,bord);
    }
    public static int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        int x=0;
        int y=0;
        int xMax = board[0]/2;
        int yMax = board[1]/2;
        for (String key: keyinput) {
            switch (key)
            {
                case "up":
                    y +=(y<yMax) ? 1:0;
                    break;
                case "down":
                    y -=(y>-yMax) ? 1:0;
                    break;
                case "right":
                    x +=(x<xMax) ? 1:0;
                    break;
                case "left":
                    x -=(x>-xMax) ? 1:0;
                    break;
            }
        }
        answer[0]= x;
        answer[1]= y;

        return answer;
    }
}
