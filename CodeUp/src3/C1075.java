/* [�ݺ����౸��] ����(1 ~ 100) 1���� �ԷµǾ��� �� ī��Ʈ�ٿ��� ����غ���.
 * �Է� : 5	-> ��� : 4
					3
					2
					1
					0	*/
import java.util.Scanner;

public class C1075 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		
		for(int i = a-1; i >= 0; i--) {
			System.out.println(i);
		}
	}

}
