/* �� ���� A�� B�� �־����� ��, A�� B�� ���ϴ� ���α׷��� �ۼ��Ͻÿ�. (-10,000 �� A, B �� 10,000)
 * A�� B���� ū ��쿡�� '>'�� ����Ѵ�. A�� B���� ���� ��쿡�� '<'�� ����Ѵ�. A�� B�� ���� ��쿡�� '=='�� ����Ѵ�.
 * �Է� : 1 2	-> ��� : <	*/
import java.util.Scanner;

public class C1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		if(a < b) {
			System.out.println("<");
		} else if(a > b) {
			System.out.println(">");
		} else {
			System.out.println("==");
		}
	}

}
