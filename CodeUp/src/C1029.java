/* �Ǽ� 1���� �Է¹޾� �״�� ����غ���. (��, �ԷµǴ� �Ǽ��� ������ +- 1.7*10-308 ~ +- 1.7*10308 �̴�.) 
 * �Էµ� �Ǽ��� �Ҽ��� ���� 11�ڸ����� �ݿø��Ͽ� ����Ѵ�.
 * �Է� : 3.14159265359	-> ��� : 3.14159265359	*/
import java.util.Scanner;

public class C1029 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double i = sc.nextDouble();
		
		System.out.printf("%.11f", i);
//ex2.	System.out.println(String.format("%.11f", i));

		sc.close();
	}

}
