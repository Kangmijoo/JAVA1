/* �ڿ��� N�� �־����� ��, N���� 1���� �� �ٿ� �ϳ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. (ù° �ٿ� 100,000���� �۰ų� ���� �ڿ��� N�� �־�����.)
 * �Է� : 5	-> ��� : 5 \ 4 \ 3 \ 2 \ 1	*/
import java.util.Scanner;

public class C06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		for(int i = N; i > 0; i--) {
			System.out.println(i);
		}
	}

}
