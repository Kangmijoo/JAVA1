/* [2차원배열] 격자판의 세로(h), 가로(w), 막대의 개수(n), 각 막대의 길이(l), 막대를 놓는 방향(d:가로는 0, 세로는 1)과
 * 막대를 놓는 막대의 가장 왼쪽 또는 위쪽의 위치(x, y)가 주어질 때, 격자판을 채운 막대의 모양을 출력하는 프로그램을 만들어보자.
 * 첫 줄에 격자판의 세로(h), 가로(w)가 공백을 두고 입력, 두 번째 줄에 막대의 개수(n) 세 번째 줄부터 각 막대의 길이(l), 방향(d), 좌표(x, y)가 입력.
 * 입력 : 5 5			-> 출력 : 1 1 0 0 0
		3					0 0 1 0 1
		2 0 1 1				0 0 1 0 1
		3 1 2 3				0 0 1 0 1
		4 1 2 5				0 0 0 0 1	*/
import java.util.Scanner;

public class C1098 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//
		int h = sc.nextInt();
		int w = sc.nextInt();
		int[][] arr = new int[h+1][w+1];
		
		//
		int n = sc.nextInt();		
		for(int i = 0; i < n; i++) {
			int l = sc.nextInt();
			int d = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			if(d == 0) {	//
				for(int j = 0; j < l; j++) {
					arr[x][y+j] = 1;
				}
			} else {		//
				for(int j = 0; j < l; j++) {
					arr[x+j][y] = 1;
				}
			}
		}
		
		//
		for(int i = 1; i <= h; i++) {
			for(int j = 1; j <= w; j++) {
				System.out.print(arr[i][j] +" ");
			}
			System.out.println();
		}
		
	}

}
