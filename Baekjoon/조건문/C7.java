/* 1~6 �ֻ��� 3���� ����. 1.���� ���� 3���� ������ 10,000��+(���� ��)��1,000���� ����� �ް� �ȴ�. 
 * 2.���� ���� 2���� ������ ��쿡�� 1,000��+(���� ��)��100���� ���. 3. ��� �ٸ� ���� ������ ��쿡�� (�� �� ���� ū ��)��100���� ���.  
 * �Է� : 3 3 6	-> ��� : 1300	/ �Է� : 2 2 2	-> ��� : 12000	/ �Է� : 6 2 5	-> ��� : 600		*/
import java.util.Scanner;

public class C7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		
		//1�� �ش� (�ֻ��� 3�� ��� ���� ���� ����)
		if(a == b && b == c) {			
			System.out.println(10000+a*1000);
		} 
		//2�� �ش� (�ֻ��� 2���� ���� ���� ����)
		else if(a == b || a == c) {		
			System.out.println(1000+a*100);
		} 
		else if(b == c) {
			System.out.println(1000+b*100);
		} 
		//3�� �ش� (�ֻ��� ��� �ٸ� ���� ����)
		else {							
			if(a > b && a > c) {			//a�� ���� ū ���� ������ ��
				System.out.println(a*100);
			} else if(b > a && b > c) {		//b�� ���� ū ���� ������ ��
				System.out.println(b*100);
			} else {						//c�� ���� ū ���� ������ ��	
				System.out.println(c*100);
			}
		}
	}

}
