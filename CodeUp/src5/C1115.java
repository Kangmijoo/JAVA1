/* 두 정수의 덧셈의 결과를 출력한다. 두 수는 int 범위를 넘어선 64비트 정수형 값이다.
 * 입력 : 11111111111 22222222222	 -> 출력 : 33333333333	*/
import java.util.Scanner;

public class C1115 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long num1 = sc.nextLong();
		long num2 = sc.nextLong();
		sc.close();
		
		System.out.println(num1+num2);
	}

}
