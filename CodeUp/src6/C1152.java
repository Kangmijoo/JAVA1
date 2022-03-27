/* 10보다 작은 정수가 입력되면 small 을 출력, 그 이상의 수가 입력되면 big 을 출력하시오. 
 * 입력 : 15	-> 출력 : big		*/
import java.util.Scanner;

public class C1152 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		
		if(a < 10) {
			System.out.println("small");
		} else {
			System.out.println("big");
		}

	}

}
