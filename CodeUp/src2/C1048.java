/* [비트시프트연산] 정수 2개(a, b)를 입력받아 a를 2의b제곱배 곱한 값으로 출력해보자. (0 <= a <= 10, 0 <= b <= 10) 
 * 입력 : 1 3	 -> 출력 : 8	*/
import java.util.Scanner;

public class C1048 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();
		
		System.out.printf("%d", num1<<num2);
//		System.out.println(num1 * (int) Math.pow(2, num2));		//a * 2의 b제곱
	}

}
