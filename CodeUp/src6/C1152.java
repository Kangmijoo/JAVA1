/* 10���� ���� ������ �ԷµǸ� small �� ���, �� �̻��� ���� �ԷµǸ� big �� ����Ͻÿ�. 
 * �Է� : 15	-> ��� : big		*/
import java.util.Scanner;

public class C1152 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		
		if(a < 10) {
			System.out.println("small");
		} else {
			System.out.println("big");
		}

	}

}
