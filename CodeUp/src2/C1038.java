/* 정수 2개를 입력받아 합을 출력하는 프로그램을 작성해보자. (단, 입력되는 정수는 -1073741824 ~ 1073741824 이다.)
 * 입력 : 123 -123	-> 출력 : 0	*/
import java.util.Scanner;
public class C1038 {
	/* ex1 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		
		String[] arr = str.split(" ");
		long a = Integer.parseInt(arr[0]);
		long b = Integer.parseInt(arr[1]);
		
		System.out.println(a + b);
	}
	
	/* ex2 */
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		long a = sc.nextLong();
//		long b = sc.nextLong();
//		
//		System.out.println(a + b);
//		
//		sc.close();
//	}

}
