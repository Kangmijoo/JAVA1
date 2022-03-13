/* [비교연산] 두 정수(a, b)를 입력받아 a와 b가 같으면 1을, 같지 않으면 0을 출력하는 프로그램을 작성해보자.
 * 입력 : 0 0	 -> 출력 : 1	*/
import java.util.Scanner;

public class C1050 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		if(a == b) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
		
	}

}
