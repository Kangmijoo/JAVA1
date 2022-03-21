/* [2차원배열] 바둑판(19 * 19)에 n개의 흰 돌을 놓는다고 할 때, n개의 흰 돌이 놓인 위치를 출력하는 프로그램을 작성해보자.
 * 바둑판에 올려 놓을 흰 돌의 개수(n)가 첫 줄에 입력된다. 둘째 줄 부터 n+1 번째 줄까지 힌 돌을 놓을 좌표(x, y)가 n줄 입력된다.
 * n은 10이하의 자연수이고 x, y 좌표는 1 ~ 19 까지이며, 같은 좌표는 입력되지 않는다. 흰 돌이 있는 위치는 1, 없는 곳은 0으로 출력한다.
 * 입력 : 5 \ 1 1 \ 2 2 \ 3 3 \ 4 4 \ 5 5		*/
import java.io.*;
import java.util.Scanner;

public class C1096 {

	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		//흰 돌 개수 입력받음
		int n = sc.nextInt();
		//바둑판 초기화
		int[][] arr = new int[19][19];
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				arr[i][j] = 0;
			}
		}
		
		//바둑알 올려진 좌표 입력 받기
		for(int i = 0; i < n; i++) {
			arr[sc.nextInt()-1][sc.nextInt()-1] = 1;
		}
		sc.close();
		
		//출력
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println("");
		}
		
		
	}
	
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int n = Integer.parseInt(br.readLine());
//		
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//	}

}
