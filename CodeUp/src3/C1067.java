/* [조건/선택실행구조] 정수 1개가 입력되었을 때, 입력된 정수에 대해 첫 줄에 minus나 plus를 출력하고, 두 번째 줄에 odd 나 even 을 출력한다. 
 * 입력 : -2147483648	 -> 출력 : minus
 * 							 even	*/
import java.util.Scanner;

public class C1067 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		
		if(a > 0) {
			System.out.println("plus");
		} else {
			System.out.println("minus");
		}
		
		if(a % 2 == 0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}
		
	}

}
