/* � ���� ���̰� 170cm �̴�. �� ���� 3���� �ͳ��� ���ʴ�� ������ �� ���̴�. �ͳ��� ���̰� ���� ���̺��� ���ų� ���ٸ� ���� �ͳΰ� �浹�Ͽ� ��� �� ���̴�.
 * �ͳ��� ���̰� ���ʴ�� 3�� �־����� �ͳ��� ������ �� ����ϸ� PASS �� ����ϰ�, ��� ���ٸ� CRASH �� ����Ͻÿ�.
 * �Է� : 170 168 175	 -> ��� : CRASH		*/
import java.util.Scanner;

public class C1164 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		
		if(a > 170 && b > 170 && c > 170) {
			System.out.println("PASS");
		} else {
			System.out.println("CRASH");
		}

	}

}
