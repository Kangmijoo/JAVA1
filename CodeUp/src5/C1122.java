/* �ʸ� �Է¹޾� �� / ���� ���·� ����Ͻÿ�.
 * �Է� : 70	-> ��� : 1 10	*/
import java.util.Scanner;

public class C1122 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		
		int sec = 60;
		
		System.out.printf("%d %d", a/sec, a%sec);

	}

}
