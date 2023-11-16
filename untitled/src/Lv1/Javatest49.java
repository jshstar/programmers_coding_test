package Lv1;

public class Javatest49 {// 하샤드 수
    public static void main(String[] args) {
        Javatest49 javatest49 = new Javatest49();
        javatest49.solution(12);
    }
    public boolean solution(int x) {
        int result=0;
        String[] sArr = Integer.toString(x).split("");
        for (int i = 0; i < sArr.length; i++) {
            result += Integer.parseInt(sArr[i]);
        }
        if(x%result ==0)
            return true;
        else return false;
    }
}
