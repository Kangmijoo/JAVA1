/* 두 수를 입력받아 비트단위로 AND연산한 후 결과를 출력하시오.
 * 입력 : 3 5	 -> 출력 : 1	*/
import java.util.Scanner;

public class C1143 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		//&, |, ^, ~ : 대상이 정수형일 경우에는 비트 논리연산자로 활용
		System.out.printf("%d", a&b);
	}

}
