package Lv0;

public class Javatest10 {// OX퀴즈
    public static void main(String[] args) {
        String[] quiz = {"3 - 4 = -3", "5 + 6 = 11"};
        solution(quiz);
    }
    public static String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        int[] input = new int[2];
        int output =0;
        int compare = 0;
        for (int i = 0; i < quiz.length; i++) {
            String check = (quiz[i].contains(" + ")) ? " + " : " - ";
            input[0] = Integer.parseInt(quiz[i].substring(0,quiz[i].indexOf(check)));
            input[1] = Integer.parseInt(quiz[i].substring(quiz[i].indexOf(check)+3,quiz[i].indexOf(" =")));
            compare = (check == " + ") ? input[0]+input[1]:input[0]-input[1];
            output = Integer.valueOf(quiz[i].substring(quiz[i].indexOf("=  ")));
            answer[i] = (output == compare) ? "O" : "X";
        }

        return answer;
    }
}
