/* �̸�, ����, �μ��ڵ�, ����Ű�� ������� ���� �ٲ� ���  1. ù° �ٿ� �̸��� �Է��Ѵ�.(������ 20 �����̳�) 2. ���� �ٿ� ���̸� �Է��Ѵ�.(����)
 * 3. ���� �ٿ� �μ��ڵ� A, B, C �� �ϳ��� �Է��Ѵ�.(������) 4. ���� �ٿ� ����Ű�� �Է��Ѵ�.(�Ǽ�)
 * �Է� : mark \ 20 \ A \ 3.154	-> ��� : mark \ 20 \ A \ 3.154	*/
import java.util.Scanner;

public class C1109 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		int age = sc.nextInt();
		char code = sc.next().charAt(0);
		double key = sc.nextDouble();
		sc.close();
		
		System.out.printf(name +"\n"+ age +"\n"+ code +"\n"+ key);

	}

}
