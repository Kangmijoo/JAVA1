/* [논리연산] 1(true, 참) 또는 0(false, 거짓) 이 입력되었을 때 반대로 출력하는 프로그램을 작성해보자.
 * 입력 : 1	-> 출력 : 0	*/
import java.util.Scanner;

public class C1053 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		if(num == 0) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
		
	}

}
