/* � �ڿ����� �ԷµǸ�  Ȧ���̸� "odd"�� ����ϰ�, ¦���̸� "even"�� ����Ͻÿ�.
 * �Է� : 5	-> ��� : odd		*/
import java.util.Scanner;

public class C1156 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		if(num % 2 == 1) {
			System.out.println("odd");
		} else {
			System.out.println("even");
		}

	}

}
