/* [����] 1���� n����, 1���� m���� ���ڰ� ���� ���� �ٸ� �ֻ��� 2���� ������ �� ���� �� �ִ� ��� ��츦 ����غ���.
 * �Է� : 2 3	 -> ��� : 1 1
					 1 2
					 1 3
					 2 1
					 2 2
					 2 3	*/
import java.util.Scanner;

public class C1081 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.close();
		
		for(int a = 1; a <= n; a++) {
			for(int b = 1; b <= m; b++) {
				System.out.printf("%d %d\n", a, b);
			}
		}
		
	}

}
