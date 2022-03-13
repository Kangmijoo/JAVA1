/* [비교연산] 두 정수(a, b)를 입력받아 a가 b보다 크면 1을, a가 b보다 작거나 같으면 0을 출력하는 프로그램을 작성해보자.
 * 입력 : 9 1	 -> 출력 : 1	*/
import java.util.Scanner;

public class C1049 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		if(a > b) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
		
	}

}
