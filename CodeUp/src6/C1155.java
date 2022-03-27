/* 7의 배수일 경우 multiple를 출력하고, 7의 배수가 아니면 not multiple을 출력하시오.
 * 입력 : 9	-> 출력 : not multiple	*/
import java.util.Scanner;

public class C1155 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		if(num % 7 == 0) {
			System.out.println("multiple");
		} else {
			System.out.println("not multiple");
		}

	}

}
