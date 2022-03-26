/* 정수 a, x를 입력받아 a의 값을 x만큼 SHIFT(>>) 연산한 후 결과를 출력하시오.
 * 입력 : 4 1	 -> 출력: 2	*/
import java.util.Scanner;

public class C1148 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		System.out.printf("%d", a>>b);
	}

}
