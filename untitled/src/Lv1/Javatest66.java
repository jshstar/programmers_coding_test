package Lv1;

public class Javatest66 { // 바탕화면 정리
	public static void main(String[] args) {
		Javatest66 javatest66 = new Javatest66();
		javatest66.solution(new String[]{".##...##.", "#..#.#..#", "#...#...#", ".#.....#.", "..#...#..", "...#.#...", "....#...."});
	}
	// 첫번째 풀이
	public int[] solution(String[] wallpaper) {
		int[] answer = new int[4];
		// 처음 y 돌렸을때 x의 최소값 x 돌렸을때 y의 최소값
		// 마지막 y 돌렸을때 x의 최대값 x 돌렸을때 y의 최대값
		firstFlag:
		for (int i = 0; i < wallpaper.length; i++) {
			for (int j = 0; j < wallpaper[i].length(); j++) {
				// y축 x 축검사
				for (int k = 0; k <wallpaper.length ; k++) {
					if(wallpaper[i].contains("#") && String.valueOf(wallpaper[k].charAt(j)).equals("#") ){
						answer[0] = i;
						answer[1] = j;
						break firstFlag;
					}
				}
			}
		}
		lastFlag:
		for (int i = wallpaper.length -1; i >=0 ; i--) {
			for (int j = wallpaper[i].length()-1;j>=0 ; j--) {
				// y축 x 축검사
				for (int k = wallpaper.length-1; k >=0 ; k--) {
					if(wallpaper[i].contains("#") && String.valueOf(wallpaper[k].charAt(j)).equals("#") ){
						answer[2] = i+1;
						answer[3] = j+1;
						break lastFlag;
					}
				}

			}
		}
		return answer;
	}

	// 다시 풀어본 풀이
	public int[] solution2(String[] wallpaper) {
		int min_x=Integer.MAX_VALUE;
		int min_y=Integer.MAX_VALUE;
		int max_x=-1;
		int max_y=-1;
		for(int i=0;i<wallpaper.length;i++){
			for(int j=0;j<wallpaper[0].length();j++){
				if(wallpaper[i].charAt(j)=='#'){
					min_x = min_x>i ? i : min_x;
					min_y = min_y>j ? j : min_y;
					max_x = max_x<i ? i : max_x;
					max_y = max_y<j ? j : max_y;
				}
			}
		}

		int[] answer = {min_x,min_y,max_x+1,max_y+1};
		return answer;
	}
}
