/* n�� �־����� ��, 1���� n���� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�. ù° �ٿ� n (1 �� n �� 10,000)�� �־�����.
 * �Է� : 3	-> ��� : 6	*/
import java.util.Scanner;

public class C03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		long result = 0;
		for(int i = 1; i <= n; i++) {
			result += i;
		}
		System.out.println(result);
	}

}