/* 734�� 893�� ĥ�ǿ� �����ٸ�, ����� �� ���� 437�� 398�� �д´�. ����, ����� �� ���� ū ���� 437�� ū ����� ���� ���̴�.
 * �� ���� �־����� ��, ����� ����� ����ϴ� ���α׷��� �ۼ�. ù° �ٿ� �� �� A�� B�� �־�����. �� ���� ���� ���� �� �ڸ� ���̸�, 0�� ���ԵǾ� ���� �ʴ�.
 * �Է� : 734 893	 -> ��� : 437	/ �Է� : 221 231	-> ��� : 132	 / �Է� : 839 237	 -> ��� : 938	*/
import java.util.Scanner;

public class C07_2908 {

	public static int reverseInt(int x) {
		int result = 0;
		
		int a = x % 10;			//���� �ڸ�
		int b = x % 100 / 10;	//���� �ڸ�
		int c = x / 100;		//���� �ڸ�
		result = a*100 + b*10 + c;
		
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		sc.close();
		
		int first = reverseInt(A);
		int second = reverseInt(B);
		
		System.out.println(first>second ? first:second);
	}

}
