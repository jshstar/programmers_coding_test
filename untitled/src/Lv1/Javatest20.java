package Lv1;
import java.util.*;
public class Javatest20 {
    public static void main(String[] args) { //폰켓몬
        int[] nums = {3,1,2,3};
        solution(nums);
    }
    public static int solution(int[] nums){
        int answer = 0;
        int takeNums = nums.length/2;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(nums[0],1);
        for (int i = 1; i < nums.length; i++) {
            if(!map.containsKey(nums[i]))
            {
                map.put(nums[i],1);
            }
            else map.put(nums[i],map.get(nums[i])+1);
        }
        if(map.size() <= takeNums)
            answer = map.size();
        else if(map.size() >= takeNums)
            answer = takeNums;
        return answer;
    }
}