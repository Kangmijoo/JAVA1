/* ���� �µ��� �ԷµǸ� ȭ�� �µ��� ��ȯ�Ͻÿ�. ȭ�� �µ� = 9 / 5 * �����µ� + 32
 * �Է� : 30	-> ��� : 86.000	*/
import java.util.Scanner;

public class C1123 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextInt();
		sc.close();
		
		double result = 9*1.0/5*a+32;
		
		System.out.printf("%.3f", result);
	}

}
