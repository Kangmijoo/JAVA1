/* 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제 (첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.)
 * 입력 : 5	-> 출력 : * \ ** \ *** \ **** \ *****		*/
import java.util.Scanner;

public class C09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		for(int i = 1; i <= N; i++) {
			int j = 1;
			while(j <= i) {
				System.out.print("*");
				j++;
			}
			System.out.println();
		}
	}

}
