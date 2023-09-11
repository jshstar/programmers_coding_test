package Lv1;

public class javatest29 { //[1차] 다트 게임
    public static void main(String[] args) {
        solution("1S2D*3T");
    }
    public static int solution(String dartResult) {
        int answer = 0;
        double[] sum = new double[3];
        int index=0;
        char c;
        String numS ="";
        for (int i = 0; i < dartResult.length(); i++) {
            c = dartResult.charAt(i);
            if( c <= '9' && c>= '0')
                numS += c;
            else if(c == 'S' || c == 'D' || c == 'T')
            {
                if(c == 'S') sum[index++]=Math.pow(Integer.parseInt(numS),1);
                else if(c == 'D') sum[index++]=Math.pow(Integer.parseInt(numS),2);
                else  sum[index++]=Math.pow(Integer.parseInt(numS),3);
                numS = "";
            }
            else
            {
                if(c == '*')
                {
                    sum[index-1] *=2;
                    if(index>=2)
                        sum[index-2] *=2;
                }
                else sum[index-1] *=(-1);
            }
        }
        answer = (int)(sum[0]+ sum[1]+ sum[2]);
        return answer;
    }
}
