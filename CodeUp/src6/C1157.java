/* �Ǽ� �Է�. 50�̻� 60�����̸� win�� ���, �� �ܿ��� lose�� ����Ͻÿ�.
 * �Է� : 50.213	-> ��� : win		*/
import java.util.Scanner;

public class C1157 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double d = sc.nextDouble();
		sc.close();
		
		if(d >= 50 && d <= 60) {
			System.out.println("win");
		} else {
			System.out.println("lose");
		}
	}

}
