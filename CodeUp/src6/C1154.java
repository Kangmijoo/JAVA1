/* ���� �ΰ��� �Է����� ������ (ū�� - ������)�� ���� ����Ͻÿ�.
 * �Է� : 5 7	 -> ��� : 2	*/
import java.util.Scanner;

public class C1154 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		if(a > b) {
			System.out.println(a-b);
		} else if(a < b) {
			System.out.println(b-a);
		} else {
			System.out.println(0);
		}

	}

}
