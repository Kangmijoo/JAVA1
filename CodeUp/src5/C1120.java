/* �� ������ �ԷµǸ� ����� ����Ͻÿ�. �� ���� ����� �Ҽ� ��°�ڸ����� ����Ͻÿ�.
 * �Է� : 1 2 3	-> ��� : 2.00	*/
import java.util.Scanner;

public class C1120 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextInt();
		double b = sc.nextInt();
		double c = sc.nextInt();
		sc.close();
		
		System.out.printf("%.2f", (a+b+c)/3);
	}

}
