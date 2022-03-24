/* 기본 연산이란, 더하기, 빼기, 곱하기, 나누기, 나머지 연산 등 5가지 연산을 말한다. 두 정수의 기본 연산을 출력하는 정수 계산기를 제작하시오. */
import java.util.Scanner;

public class C1126 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		System.out.printf("%d + %d = %d\n", a, b, a+b);
		System.out.printf("%d - %d = %d\n", a, b, a-b);
		System.out.printf("%d * %d = %d\n", a, b, a*b);
		System.out.printf("%d / %d = %d\n", a, b, a/b);
		System.out.printf("%d %% %d = %d\n", a, b, a%b);

	}

}