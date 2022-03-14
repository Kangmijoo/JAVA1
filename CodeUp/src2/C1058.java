/* [논리연산] 두 개의 참(1) 또는 거짓(0)이 입력될 때, 둘 다 거짓일 경우에만 1을 출력하고, 그 외의 경우에는 0을 출력한다.
 * 입력 : 0 1	 -> 입력 : 0		*/
import java.util.Scanner;

public class C1058 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		if(a == 0 && b == 0) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
		
	}

}
