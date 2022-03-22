/* 삼각형의 넓이를 구하는 프로그램을 작성한다. 밑변(a)과 높이(b)가 정수로 입력된다. 삼각형의 넓이를 소수 첫째자리까지 출력한다.
 * 입력 : 5 2	 -> 출력 : 5.0	*/
import java.util.Scanner;

public class C1118 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		sc.close();
		
		System.out.printf("%.1f", a*b/2);
	}

}
