/* 정수 두개가 입력으로 들어오면 (큰수 - 작은수)의 값을 출력하시오.
 * 입력 : 5 7	 -> 출력 : 2	*/
import java.util.Scanner;

public class C1154 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		if(a > b) {
			System.out.println(a-b);
		} else if(a < b) {
			System.out.println(b-a);
		} else {
			System.out.println(0);
		}

	}

}
