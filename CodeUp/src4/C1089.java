/* [����] ���� ��(a), ����(d), �� ��°������ ��Ÿ���� ����(n)�� �Էµ� �� n��° ���� ����ϴ� ���α׷��� ������.
 * �Է� : 1 3 5	-> ��� : 13		*/
import java.util.Scanner;

public class C1089 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int d = sc.nextInt();
		int n = sc.nextInt();
		sc.close();
		
		System.out.println(a+(n-1)*d);
		
	}

}
