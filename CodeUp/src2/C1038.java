/* ���� 2���� �Է¹޾� ���� ����ϴ� ���α׷��� �ۼ��غ���. (��, �ԷµǴ� ������ -1073741824 ~ 1073741824 �̴�.)
 * �Է� : 123 -123	-> ��� : 0	*/
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
