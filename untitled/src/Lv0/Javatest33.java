package Lv0;

public class Javatest33 { // 문자열 여러번 뒤집기
    public static void main(String[] args) {
        int[][] queries = {{2, 3},{0, 7},{5, 9},{6, 10}};
        solution("rermgorpsam",queries);
    }
    public static String solution(String my_string, int[][] queries) {
        String answer = "";
        StringBuffer sb = new StringBuffer();
        sb.append(my_string);
        for (int i = 0; i < queries.length; i++) {
            char[] temp = new char[queries[i][1]-queries[i][0]+1];
            for (int j =0; j < queries[i][1]-queries[i][0]+1; j++) {
                temp[j]= sb.charAt(j+queries[i][0]);

            }
            sb.delete(queries[i][0],queries[i][1]+1);
            for (int j = 0; j <temp.length; j++) {
                sb.insert(queries[i][0],temp[j]);
            }

        }
        answer = sb.toString();
        return answer;
    }

}
