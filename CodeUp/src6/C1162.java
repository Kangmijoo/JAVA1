/* �� ��(��,��,��)�� �־�����,  (�� - �� + ��)�� ������ ���ڰ� 0�̸� "���"�� ���, �׷��� ������ "�׷�����"�� ����ϼ���.
 * �Է� : 1902 2 10	-> ��� : ���		*/
import java.util.Scanner;

public class C1162 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		int month = sc.nextInt();
		int day = sc.nextInt();
		sc.close();
		
		int result = year-month+day;
		if(result % 10 == 0) {
			System.out.println("���");
		} else {
			System.out.println("�׷�����");
		}
	}

}
