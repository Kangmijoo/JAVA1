/* [�񱳿���] �� ����(a, b)�� �Է¹޾� a�� b�� ���� �ٸ��� 1��, �׷��� ������ 0�� ����ϴ� ���α׷��� �ۼ��غ���.
 * �Է� : 0 1	 -> ��� : 1	*/
import java.util.Scanner;

public class C1052 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		if(a != b) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
		
	}

}
