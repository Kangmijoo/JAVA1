/* [종합] 시작 값(a), 등비(r), 몇 번째인지를 나타내는 정수(n)가 입력될 때 n번째 수를 출력하는 프로그램을 만들어보자. (모두 0 ~ 10)
 * 입력 : 2 3 7	-> 출력 : 1458	*/
import java.util.Scanner;

public class C1090 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int r = sc.nextInt();
		int n = sc.nextInt();
		sc.close();
		
		double num = a * Math.pow(r, n-1);
		System.out.printf("%.0f", num);

	}

}
