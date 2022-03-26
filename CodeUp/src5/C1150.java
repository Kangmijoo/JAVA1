/* 세 정수가 주어지면 그 중 가장 작은 수를 출력한다.
 * 입력 : 3 5 2	-> 2	*/
import java.util.Scanner;

public class C1150 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		
		if(a<=b && a<=c) {
			System.out.println(a);
		} else if (b<=a && b<=c) {
			System.out.println(b);
		} else {
			System.out.println(c);
		}
	}

}
