package Lv0;

public class Javatest3 {
    public static void main(String[] args) {// 평행
        int[][] dots = {{1, 4},{9, 2},{3, 8},{11, 6}};
        solution(dots);
    }
    public static int solution(int[][] dots) {
        int answer = 0;
        float[] line = new float[6]; //기울기 세는 배열

        //index로 돌리면서 바로 채움 line에
        int index = 0;

        for(int i = 0; i < 3; i++) {
            for(int j = i + 1; j < 4; j++) {
                float result
                        = (float)(dots[i][1] - dots[j][1])
                        / (float)(dots[i][0] - dots[j][0]);
                line[index] = result;
                index++;
            }
        }

        //평행 체크
        for(int k = 0; k < line.length-1 ; k++){
            for(int m=k+1; m<line.length;m++) {
                if (line[k] == line[m]) return 1;
            }
        }

        return answer;

    }
}
