/* 입력 받은 두 정수를 출력한다.
 * 입력 : 5 7	 -> 출력 : 5 7	*/
import java.util.Scanner;

public class C1112 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();
		
		System.out.println(num1 +" "+ num2);
	}
	
}
