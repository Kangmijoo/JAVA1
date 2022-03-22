/* 두 정수를 입력받아 순서를 바꿔서 출력하시오.
 * 입력 : 1 2	 -> 출력 : 2 1	*/
import java.util.Scanner;

public class C1113 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();
		
		System.out.println(num2 +" "+ num1);
	}

}
