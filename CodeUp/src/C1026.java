/* �ԷµǴ� ��:��:�� ���� �и� ����غ���. 
 * �Է� : 12:2:3	-> ��� : 02	*/
import java.util.Scanner;

public class C1026 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] arr = str.split(":");
		
		//String�迭�� int�� ��ȯ
		int b = Integer.parseInt(arr[1]);
		
		System.out.printf("%d", b);
		
		sc.close();

	}

}
