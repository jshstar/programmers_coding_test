package Lv0;
import java.util.*;
public class Javatest9 {// 배열 조각하기
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5};
        int[] query = {4,1,2};
        solution(arr,query);

    }
    public static int[] solution(int[] arr, int[] query) {

        int[] answer ={};
        for(int i=0; i< query.length; i++)
        {
            if(query[i]%2 ==0) // 짝수배열 조각
            {
                int index = query[i];
                arr = Arrays.copyOfRange(arr,0,query[i]+1);
            }
            else // 홀수 배열 조각
            {
                int index = query[i];
                arr = Arrays.copyOfRange(arr,query[i],arr.length);
            }
        }
        return arr;
    }


}
