package Lv1;

public class javatest37 {
    public static void main(String[] args) { //둘만의 암호
        solution("aukks","wbqd",5);
    }
    public static String solution(String s, String skip, int index) {
        String answer = "";
        char[] sc = s.toCharArray();
        for (int i = 0; i < sc.length; i++) {
            for (int j = 0; j < index; j++) {
                sc[i]++;
                if (sc[i] > 'z')
                    sc[i] = 'a';
                while (skip.contains(String.valueOf(sc[i]))) {
                    sc[i]++;
                    if (sc[i] > 'z')
                        sc[i] = 'a';
                }
            }
            answer += sc[i];
        }

        return answer;
    }
}
