/* �ֿ��̴� ��, ��, ��, �� �Ƹ�����Ʈ�� ����. 1.������ 2.ȭ���� 3.������ 4.����� 5.�ݿ��� 6.����� 7.�Ͽ���
 * ������ ��ȣ�� �Է����� �־����� �� ���� �Ƹ�����Ʈ ���� ���̸� "oh my god"�� ���� ���� �ƴϸ� "enjoy"�� ����Ͻÿ�.
 * �Է� : 1	-> ��� : oh my god	*/
import java.util.Scanner;

public class C1160 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		if(n==2 || n==4 || n==6) {
			System.out.println("enjoy");
		} else {
			System.out.println("oh my god");
		}

	}

}
