/* [���׿���] �Էµ� �� ���� a, b, c �� ���� ���� ���� ����ϴ� ���α׷��� �ۼ��غ���. (��, ���ǹ��� ������� �ʰ� 3�� ������ ? �� ����Ѵ�.)
 * �Է� : 3 -1 5	-> ��� : -1		 */
import java.util.Scanner;

public class C1064 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		
		System.out.printf("%d", (a<b ? a:b)<c ? (a<b ? a:b):c);

	}

}
