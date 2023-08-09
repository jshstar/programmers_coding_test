package Lv0;

public class javatest31 { // 수열과 구간 쿼리2
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 4, 3};
        int[][] queries = {{0, 4, 2},{0,3,2},{0,2,2}};
        solution(arr,queries);
    }
    public static int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        int cnt = 0;
        int min;
        int temp=0;
        for (int i = 0; i < queries.length ; i++) {
            min = 1000000;
            for (int j = queries[i][0]; j < queries[i][1]+1; j++) {
                if( arr[j]-queries[i][2] < min &&  arr[j]-queries[i][2] >0)
                {
                    min = arr[j]-queries[i][2];
                    temp = arr[j];
                }

            }
            if(min == 1000000)
            {
                answer[cnt]= -1;
                cnt++;
            }
            else{
                answer[cnt] = temp;
                cnt++;
            }
        }
        return answer;
    }
}
