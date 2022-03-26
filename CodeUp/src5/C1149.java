/* 두 정수 중 큰 정수를 출력한다.
 * 입력 : 2 7	 -> 출력 : 7	*/
import java.util.Scanner;

public class C1149 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		System.out.println(a>b?a:b);
	}

}
