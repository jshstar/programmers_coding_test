package Lv0;

public class Javatest32 { // 직사각형으로 만들기
    public static void main(String[] args) {
        int[][] arr= {{572, 22, 37},{287, 726, 384},{85, 137, 292},{487, 13, 876}};
        solution(arr);
    }
    public static int[][] solution(int[][] arr) {
        int r=0,c=0,leng=0;
        c = arr.length;
        r = arr[0].length;
        if(c==r) leng =c;
        else leng = c<r?r:c;
        int[][] answer = new int[leng][leng];
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                answer[i][j] = arr[i][j];
            }
        }
        return answer;
    }
}
