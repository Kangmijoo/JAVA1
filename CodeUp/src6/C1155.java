/* 7�� ����� ��� multiple�� ����ϰ�, 7�� ����� �ƴϸ� not multiple�� ����Ͻÿ�.
 * �Է� : 9	-> ��� : not multiple	*/
import java.util.Scanner;

public class C1155 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		if(num % 7 == 0) {
			System.out.println("multiple");
		} else {
			System.out.println("not multiple");
		}

	}

}
