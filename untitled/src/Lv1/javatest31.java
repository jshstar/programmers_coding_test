package Lv1;

public class javatest31 {// 옹알이(2)
    public static void main(String[] args) {
        String[] babbling = {"aya", "yee", "u"};
        solution(babbling);
    }
    public static int solution(String[] babbling) {
        int answer = 0;
        String[] speak = {"aya","ye","woo","ma"};
        String s;
        boolean flag;
        for (int i = 0; i < babbling.length; i++) {
            s= babbling[i];
            flag = true;
            for (int j = 0; j < speak.length; j++) {
                s=s.replace(speak[j], Integer.toString(j));
            }
            char[] c = new char[s.length()];
            for (int j = 0; j < s.length(); j++) {
                 c[j]= s.charAt(j);
                if(!(c[j] >= '0' && c[j] <= '3'))
                {
                    flag = false;
                    break;
                }
                else if (j !=0) {
                     if (c[j - 1] == c[j])
                     {
                         flag = false;
                         break;
                     }
                 }
            }
            if(flag) answer++;
        }
        return answer;
    }



}
