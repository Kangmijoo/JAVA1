/* [논리연산] 두 개의 참(1) 또는 거짓(0)이 입력될 때, 참/거짓이 서로 같을 때에만 1을 출력하고, 그 외의 경우에는 0을 출력한다.
 * 입력 : 0 0	 -> 출력 : 1		*/
import java.util.Scanner;

public class C1057 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		if((a == 0 && b == 0) || (a == 1 && b == 1)) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
		
	}

}
