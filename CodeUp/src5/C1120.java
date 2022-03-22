/* 세 정수가 입력되면 평균을 출력하시오. 세 수의 평균을 소수 둘째자리까지 출력하시오.
 * 입력 : 1 2 3	-> 출력 : 2.00	*/
import java.util.Scanner;

public class C1120 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextInt();
		double b = sc.nextInt();
		double c = sc.nextInt();
		sc.close();
		
		System.out.printf("%.2f", (a+b+c)/3);
	}

}
