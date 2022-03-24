/* 10진수 정수를 입력받아 8진수와 16진수로 출력한다.
 * 입력 : 10	-> 출력 : 12 A	*/
import java.util.Scanner;

public class C1125 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		
		System.out.printf("%o %X", a, a);

	}

}
