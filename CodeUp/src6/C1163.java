/* �� ��(��,��,��)�� �־�����,  (�� + �� + ��)�� 100�� �ڸ� ���ڰ� ¦���̸� "���"�� ���, �׷��� ������ "�׷�����"�� ����ϼ���.
 * �Է� : 1502 2 10	-> ��� : �׷�����	*/
import java.util.Scanner;

public class C1163 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		int month = sc.nextInt();
		int day = sc.nextInt();
		sc.close();
		
		//��+��+�� -> ������ 3��° �ڸ� ���� �������� -> 100�� �ڸ� ���� ���
		String str = String.valueOf(year+month+day);
		int result = Integer.parseInt(str.substring(str.length()-3, str.length()-2));
		
		if(result % 2 == 0) {
			System.out.println("���");
		} else {
			System.out.println("�׷�����");
		}
			
	}

}
