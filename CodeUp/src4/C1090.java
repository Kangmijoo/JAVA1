/* [����] ���� ��(a), ���(r), �� ��°������ ��Ÿ���� ����(n)�� �Էµ� �� n��° ���� ����ϴ� ���α׷��� ������. (��� 0 ~ 10)
 * �Է� : 2 3 7	-> ��� : 1458	*/
import java.util.Scanner;

public class C1090 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int r = sc.nextInt();
		int n = sc.nextInt();
		sc.close();
		
		double num = a * Math.pow(r, n-1);
		System.out.printf("%.0f", num);

	}

}
