/* [������] 1(true, ��) �Ǵ� 0(false, ����) �� �ԷµǾ��� �� �ݴ�� ����ϴ� ���α׷��� �ۼ��غ���.
 * �Է� : 1	-> ��� : 0	*/
import java.util.Scanner;

public class C1053 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		if(num == 0) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
		
	}

}
