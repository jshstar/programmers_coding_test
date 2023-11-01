package Lv0;

public class Javatest27 { // 그림 확대
    public static void main(String[] args) {
        String[] picture = {".xx...xx.", "x..x.x..x", "x...x...x", ".x.....x.", "..x...x..", "...x.x...", "....x...."};
        solution(picture,2);
    }
    public static String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length*k];
        String sum;
        char temp;
        for (int i = 0; i < picture.length; i++) {
            sum ="";
            for (int j = 0; j < picture[i].length(); j++) {
                temp = picture[i].charAt(j);
                for (int l = 0; l < k; l++) {
                    sum += temp;
                }
            }
            for (int a = i*k; a <i*k+k; a++) {
                answer[a] = sum;
            }
        }
        return answer;
    }
}
