/* 두 실수를 입력받아 두 실수의 곱을 출력하되 소수 둘째자리까지 출력하시오.
 * 입력 : 1.23 4.56	-> 출력 : 5.61	*/
import java.util.Scanner;

public class C1117 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		sc.close();
		
		System.out.printf("%.2f", a*b);
	}

}
