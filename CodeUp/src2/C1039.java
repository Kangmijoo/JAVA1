/* 정수 2개를 입력받아 합을 출력해보자. 단, 입력되는 정수는 -2147483648 ~ +2147483648 이다.
 * 입력 : 2147483648 2147483648	-> 출력 : 4294967296 	*/
import java.util.Scanner;
public class C1039 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long num = sc.nextLong();
		long num2 = sc.nextLong();
		sc.close();
		
		System.out.println(num + num2);
	}

}
