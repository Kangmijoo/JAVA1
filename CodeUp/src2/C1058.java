/* [������] �� ���� ��(1) �Ǵ� ����(0)�� �Էµ� ��, �� �� ������ ��쿡�� 1�� ����ϰ�, �� ���� ��쿡�� 0�� ����Ѵ�.
 * �Է� : 0 1	 -> �Է� : 0		*/
import java.util.Scanner;

public class C1058 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		if(a == 0 && b == 0) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
		
	}

}
