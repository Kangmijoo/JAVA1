/* 어떤 자연수가 입력되면  홀수이면 "odd"을 출력하고, 짝수이면 "even"을 출력하시오.
 * 입력 : 5	-> 출력 : odd		*/
import java.util.Scanner;

public class C1156 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		if(num % 2 == 1) {
			System.out.println("odd");
		} else {
			System.out.println("even");
		}

	}

}
