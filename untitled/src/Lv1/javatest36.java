package Lv1;

import java.util.Arrays;

public class javatest36 { // 대충 만든 자판
    public static void main(String[] args) {
        String[] keymap = {"AA"};
        String[] targets = {"B"};
        solution(keymap,targets);
    }
    public static int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        int min;
        int cnt;
        for (int i = 0; i < targets.length; i++) {
                targets[i] = targets[i]+"0";
                cnt =0;
            for (int j = 0; j < targets[i].length()-1; j++) {
                String s = targets[i].substring(j,j+1);
                min = 101;
                for (int k = 0; k < keymap.length; k++) {
                    if (min > keymap[k].indexOf(s) &&  keymap[k].indexOf(s) > -1)
                        min= keymap[k].indexOf(s)+1;
                }
                if(min ==101)
                {
                    cnt = -1;
                    break;
                }
                else cnt +=min;
            }
            answer[i] = cnt;
        }
        return answer;
    }
}
