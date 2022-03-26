/* 두 수를 입력받아 비트단위로 OR연산한 후 결과를 출력하시오.
 * 입력 : 3 5	 -> 출력 : 7	*/
import java.util.Scanner;

public class C1144 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		System.out.printf("%d", a|b);

	}

}
