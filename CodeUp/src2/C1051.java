/* [�񱳿���] �� ����(a, b)�� �Է¹޾� b�� a���� ũ�ų� ������ 1��, �׷��� ������ 0�� ����ϴ� ���α׷��� �ۼ��غ���. 
 * �Է� : 0 -1  -> ��� : 0		*/
import java.util.Scanner;

public class C1051 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		if(b >= a) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}

	}

}
