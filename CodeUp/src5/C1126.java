/* �⺻ �����̶�, ���ϱ�, ����, ���ϱ�, ������, ������ ���� �� 5���� ������ ���Ѵ�. �� ������ �⺻ ������ ����ϴ� ���� ���⸦ �����Ͻÿ�. */
import java.util.Scanner;

public class C1126 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		System.out.printf("%d + %d = %d\n", a, b, a+b);
		System.out.printf("%d - %d = %d\n", a, b, a-b);
		System.out.printf("%d * %d = %d\n", a, b, a*b);
		System.out.printf("%d / %d = %d\n", a, b, a/b);
		System.out.printf("%d %% %d = %d\n", a, b, a%b);

	}

}