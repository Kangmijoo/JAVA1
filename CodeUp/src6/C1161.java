/* ���� ù��° ������ Ȧ���̸� "Ȧ��"�� ����ϰ�, ¦���̸� "¦��"�� ����� ��  "+"�� ����Ѵ�. 
 * �׸��� �ι�° ������ Ȧ���̸� "Ȧ��"�� ����ϰ�, ¦���̸� "¦��"�� ����� ��  "="�� ����ϰ� ����� ������ ���� Ȧ������ ¦������ ����Ѵ�.
 * �Է� : 2 3	 -> ��� : ¦��+Ȧ��=Ȧ��		*/
import java.util.Scanner;

public class C1161 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		if(a % 2 == 0) {
			if(b % 2 == 0) {
				System.out.println("¦��+¦��=¦��");
			} else {
				System.out.println("¦��+Ȧ��=Ȧ��");
			}
		} else {
			if(b % 2 == 0) {
				System.out.println("Ȧ��+¦��=Ȧ��");
			} else {
				System.out.println("Ȧ��+Ȧ��=¦��");
			}
		}
	}

}
