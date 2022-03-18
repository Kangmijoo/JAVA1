/* [종합] 1부터 n까지, 1부터 m까지 숫자가 적힌 서로 다른 주사위 2개를 던졌을 때 나올 수 있는 모든 경우를 출력해보자.
 * 입력 : 2 3	 -> 출력 : 1 1
					 1 2
					 1 3
					 2 1
					 2 2
					 2 3	*/
import java.util.Scanner;

public class C1081 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.close();
		
		for(int a = 1; a <= n; a++) {
			for(int b = 1; b <= m; b++) {
				System.out.printf("%d %d\n", a, b);
			}
		}
		
	}

}
