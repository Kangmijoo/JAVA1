/* 10진수를 입력받아 8진수(octal)로 출력해보자.
 * 입력 : 10	-> 출력 : 12	*/
import java.util.Scanner;

public class C1031 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		System.out.printf("%o", a);

		sc.close();
	}

}
