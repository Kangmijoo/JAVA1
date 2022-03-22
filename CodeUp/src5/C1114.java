/* 두 정수를 입력받아 합을 출력한다.
 * 입력 : 5 7	 -> 출력 : 12		*/
import java.util.Scanner;

public class C1114 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();
		
		System.out.println(num1+num2);
	}

}
