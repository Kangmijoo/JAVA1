/* [종합] 시작 값(a), 등차(d), 몇 번째인지를 나타내는 정수(n)가 입력될 때 n번째 수를 출력하는 프로그램을 만들어보자.
 * 입력 : 1 3 5	-> 출력 : 13		*/
import java.util.Scanner;

public class C1089 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int d = sc.nextInt();
		int n = sc.nextInt();
		sc.close();
		
		System.out.println(a+(n-1)*d);
		
	}

}
