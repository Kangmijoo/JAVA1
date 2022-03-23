/* 정수 계산에서 나머지를 구하시오.
 * 입력 : 7 5	 -> 출력 : 2	*/
import java.util.Scanner;

public class C1121 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		System.out.println(a % b);

	}

}
