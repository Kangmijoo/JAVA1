/* �ֹι�ȣ�� �Է¹޾� ���¸� �ٲ� ����غ���. 
 * �Է� : 000907-1121112	-> ��� : 0009071121112	*/
import java.util.Scanner;

public class C1020 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();		// 123456-7890123
		String[] arr = str.split("-");
		
		//ex1
		System.out.printf("%s%s", arr[0], arr[1]);
		
		/* ex2
		 * arr[0] = 123456, arr[1] = 7890123 
		 * 123456 ����� ���� 7890123 ��� -> 1234567890123
		 */
//		for(String a : arr ) {
//			System.out.print(a);
//		}

		sc.close();
	}

}
