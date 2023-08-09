package Lv1;

public class javatest10 { // [1차] 비밀지도
    public static void main(String[] args) {
        int[] arr1 ={46, 33, 33 ,22, 31, 50};
        int[] arr2 ={27 ,56, 19, 14, 14, 10};
        solution(6,arr1,arr2);

    }
    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String line1, line2;
        String k = Integer.toString(n);
        String[] compareLine1;
        String[] compareLine2;
        for (int i = 0; i < arr1.length; i++) {
            line1 = String.format("%0"+k+"d",Long.parseLong(Long.toBinaryString(arr1[i]))) ;
            line2 = String.format("%0"+k+"d",Long.parseLong(Long.toBinaryString(arr2[i])));
            compareLine1 = line1.split("");
            compareLine2 = line2.split("");
            answer[i] ="";
            for (int j = 0; j < line1.length(); j++) {
                if(compareLine1[j].equals("1") || compareLine2[j].equals("1"))
                    answer[i] += "#";
                else answer[i] += " ";
            }
        }
        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }
        return answer;
    }
}
