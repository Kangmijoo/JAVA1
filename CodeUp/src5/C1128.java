/* n�� �ԷµǸ� n��123456789 �� ����� ����Ͻÿ�. ���� n�� �Էµȴ�.(0<=n<=100). ����Ű���� : long, double, float
 * �Է� : 1	-> ��� : 123456789	*/
import java.util.Scanner;

public class C1128 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		//123456789�ڿ� ���̻� L�� �ٿ���� ������ longŸ���� �ż� ��� ����
		System.out.println(n*123456789L);
	}

}
