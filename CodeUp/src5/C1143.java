/* �� ���� �Է¹޾� ��Ʈ������ AND������ �� ����� ����Ͻÿ�.
 * �Է� : 3 5	 -> ��� : 1	*/
import java.util.Scanner;

public class C1143 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		//&, |, ^, ~ : ����� �������� ��쿡�� ��Ʈ �������ڷ� Ȱ��
		System.out.printf("%d", a&b);
	}

}
