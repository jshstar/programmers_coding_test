package Lv0;
import java.util.*;
public class Javatest5 {//주사위 게임3
    public static void main(String[] args) {
        solution(4,1,4,4);
    }
    public static int solution(int a, int b, int c, int d) {
        int[] pointarray = {a, b, c, d};
        int point=0;
        int sum=0;
        for(int i =0; i<4; i++)
        {
            for(int k=i+1; k<4; k++)
            {
                if(pointarray[i] == pointarray[k]) point++;
            }
        }
        Arrays.sort(pointarray);
        if(point == 6)
            sum = 1111*pointarray[0];
        else if(point == 3)
        {
            int cal =0;
            if(pointarray[0]<pointarray[1]) cal = 10*pointarray[1]+pointarray[0];
            else cal = 10*pointarray[0]+pointarray[3];
            sum = (int)Math.pow(cal,2);
        }
        else if(point == 2) sum = (pointarray[0]+ pointarray[2]) * Math.abs((pointarray[0]-pointarray[2]));
        else if(point == 1)
        {
            if(pointarray[0]== pointarray[1]) sum = pointarray[2]*pointarray[3];
            else if(pointarray[1]== pointarray[2]) sum = pointarray[0]*pointarray[3];
            else sum = pointarray[0]*pointarray[1];
        }
        else sum = pointarray[0];
        return sum;
    }
}
