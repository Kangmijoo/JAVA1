/* [����] ���� ��(a), ���� ��(m), ���� ��(d), �� ��°������ ��Ÿ���� ����(n)�� �Էµ� ��, n��° ���� ����ϴ� ���α׷��� ������. 
 * (a, m, d�� -50 ~ +50, n�� 10������ �ڿ���)
 * �Է� : 1 -2 1 8	-> ��� : -85		*/
import java.util.Scanner;

public class C1091 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int m = sc.nextInt();
		int d = sc.nextInt();
		int n = sc.nextInt();
		sc.close();
		
		long result = 0;
		result = a;			//n�� 1�� ��� ���� �� �ٷ� ����� �� �ֵ���
		
		for(int i = 1; i < n; i++) {
			if(i == 1) {		//ó������ '���۰�'�� ���ϰ� ���ϱ�
				result = a*m+d;
			} else {			//�ι�° ���ʹ� �� �� ���� ���ϰ� ���ϱ�
				result = result*m+d;
			}
		}
		System.out.print(result);
	}

}
