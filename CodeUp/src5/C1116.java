/* �� ���� a, b�� �Է¹޴´�. a�� b�� ���� ��Ģ���� ����� ��Ŀ� ���߾� ����Ѵ�.
 * �Է� : 3 2	 -> ��� : 3+2=5
					 3-2=1
					 3*2=6
					 3/2=1		*/
import java.util.Scanner;

public class C1116 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		System.out.printf("%d+%d=%d\n", a, b, a+b);
		System.out.printf("%d-%d=%d\n", a, b, a-b);
		System.out.printf("%d*%d=%d\n", a, b, a*b);
		System.out.printf("%d/%d=%d\n", a, b, a/b);
	}

}
