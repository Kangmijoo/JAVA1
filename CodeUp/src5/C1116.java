/* 두 정수 a, b를 입력받는다. a와 b에 대한 사칙연산 결과를 양식에 맞추어 출력한다.
 * 입력 : 3 2	 -> 출력 : 3+2=5
					 3-2=1
					 3*2=6
					 3/2=1		*/
import java.util.Scanner;

public class C1116 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		System.out.printf("%d+%d=%d\n", a, b, a+b);
		System.out.printf("%d-%d=%d\n", a, b, a-b);
		System.out.printf("%d*%d=%d\n", a, b, a*b);
		System.out.printf("%d/%d=%d\n", a, b, a/b);
	}

}
