/* 10보다 작은 수가 입력되면 small 을 출력, 10이상이면 아무것도 출력하지 마시오.
 * 입력 : 5	-> 출력 : small	*/
import java.util.Scanner;

public class C1151 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		
		if(a < 10) {
			System.out.println("small");
		}
	}

}
