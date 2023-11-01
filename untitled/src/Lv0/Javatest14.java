package Lv0;

public class Javatest14 {// 배열만들기2
    public static void main(String[] args) {
        solution(5,555);
    }
    public static int[] solution(int l, int r) {
        int[] result = new int[r];
        String[] check  = {"1","2","3","4","6","7","8","9"};
        String strNum;
        boolean resultCk = false;
        int cnt =0;
        for (int i = l; i <= r; i++) {
            int temp =0;
            if (i % 5 == 0) {
                strNum = String.valueOf(i);
                for (String s : check) {
                    if (strNum.contains(s))
                        temp++;
                }
                if (temp ==0) {
                    result[cnt] = i;
                    cnt++;
                    resultCk =true;
                }
            }
        }
        if(resultCk ==false) cnt++;
        int[] answer= new int[cnt];
        if(resultCk == true)
        {
            for (int i =0; i<cnt; i++ )
            {
                answer[i] = result[i];
            }
        }
        else answer[0] =-1;
        return answer;
    }
}
