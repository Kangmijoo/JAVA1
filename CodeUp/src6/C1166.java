/* � �ذ� �ԷµǸ� �� �ذ� �������� �ƴ��� �Ǻ��Ͻÿ�. �����̸� "yes"�� ���, ������ �ƴϸ� "no"�� ����Ͻÿ�.
 * ���� �Ǵ� ����) 1. ��(year)�� 4�� ����̸鼭 100�� ����� �ƴϸ� ����. 2. 400�� ����̸� ����. �� ���� �� �ϳ��� ������ �����̴�.
 * �Է� : 2012	-> ��� : yes		*/
import java.util.Scanner;

public class C1166 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		sc.close();
		
		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
	}

}
