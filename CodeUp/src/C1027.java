/* ������� ����ϴ� ����� ���󸶴�, ���ĸ��� ���ݾ� �ٸ���.
 * �����(yyyy.mm.dd)�� �Է¹޾�, �Ͽ���(dd-mm-yyyy)�� ����غ���.
 * (��, �� �ڸ� ��/���� 0�� �ٿ� ���ڸ���, �⵵�� 0�� �ٿ� ���ڸ��� ����Ѵ�.) 
 */
import java.util.Scanner;

public class C1027 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] arr = str.split("\\.");
		
		int y = Integer.parseInt(arr[0]);
		int m = Integer.parseInt(arr[1]);
		int d = Integer.parseInt(arr[2]);
		
		System.out.printf("%02d-%02d-%02d", d, m, y);
		
		sc.close();

	}
	
	// ex2
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String str = sc.nextLine();
//		sc.close();
//		
//		String[] arr = str.split("\\.");
//		int[] arr1 = new int[arr.length];		//arr�� ���̿� ���� int�� �迭 ����
//		
//		for(int i = 0; i < arr.length; i++) {
//			arr1[i] = Integer.parseInt(arr[i]);		//���������� ��ȯ
//		}
//		
//		System.out.printf("%02d-%02d-%04d", arr1[2], arr1[1], arr1[0]);
//
//	}

}
