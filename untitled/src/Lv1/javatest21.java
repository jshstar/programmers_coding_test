package Lv1;

public class javatest21 {
    public static void main(String[] args) { // 카드 뭉치
        String[] card1 = {"i", "water", "drink"};
        String[] card2 = {"want", "to"};
        String[] goal = {"i", "want", "to", "drink", "water"};
        solution(card1,card2,goal);
    }
    public static String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        int cnt1 =0,cntmax1 = cards1.length;
        int cnt2 =0, cntmax2 = cards2.length;
        boolean ck1 =true, ck2 = true;
        for (int i = 0; i < goal.length; i++) {
            if(goal[i].equals(cards1[cnt1]) && ck1)
            {
                if(cnt1 + 1 == cntmax1)
                    ck1 = false;
                else cnt1++;
            }
            else if(goal[i].equals(cards2[cnt2]) && ck2)
            {
                if(cnt2 +1  == cntmax2)
                    ck2 = false;
                else cnt2++;
            }
            else{
                answer ="No";
                break;
            }
        }
        if(answer != "No")
            answer = "Yes";

        return answer;
    }
}