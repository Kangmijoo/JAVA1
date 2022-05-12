/* 2차원 평면 위의 점 N개가 주어진다. 좌표를 y좌표가 증가하는 순으로, y좌표가 같으면 x좌표가 증가하는 순서로 정렬한 다음 출력하는 프로그램을 작성하시오.
 * 입력 : 5 \ 0 4 \ 1 2 \ 1 -1 \ 2 2 \ 3 3	-> 출력 : 1 -1 \ 1 2 \ 2 2 \ 3 3 \ 0 4	*/
import java.util.Arrays;
import java.util.Scanner;

public class C07_11651 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] arr = new int[N][2];
		//배열에 입력 받기
		for(int i = 0; i < N; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}
		sc.close();
		
		//정렬
		Arrays.sort(arr, (o1, o2) -> {
			if(o1[1] == o2[1]) {
				return o1[0] - o2[0];
			} else {
				return o1[1] - o2[1];
			}
		});
		
		//출력
		for(int i = 0; i < N; i++) {
			System.out.println(arr[i][0] +" "+ arr[i][1]);
		}

	}

}
