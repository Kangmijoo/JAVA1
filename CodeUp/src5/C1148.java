/* ���� a, x�� �Է¹޾� a�� ���� x��ŭ SHIFT(>>) ������ �� ����� ����Ͻÿ�.
 * �Է� : 4 1	 -> ���: 2	*/
import java.util.Scanner;

public class C1148 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		System.out.printf("%d", a>>b);
	}

}
