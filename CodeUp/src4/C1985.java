/* [����] h, b, c, s �� ������ �ΰ� �Էµȴ�. h�� 48,000����, b�� 32����(��, 8�ǹ��), c�� 5����, s�� 6,000������ �ڿ����̴�.
 * �ʿ��� ���� ������ MB ������ �ٲپ� ����Ѵ�. ��, �Ҽ��� ��° �ڸ����� �ݿø��� ù° �ڸ����� ����ϰ� MB�� ������ �ΰ� ����Ѵ�.
 * �Է� : 44100 16 2 10	-> ��� : 1.7 MB		*/
import java.util.Scanner;

public class C1985 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double h = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double s = sc.nextDouble();
		sc.close();
		
		double cal = Math.pow(2, 23);	//bit�� mb�� ��ȯ -> 8*1024*1024
		double total = h*b*c*s;
		double result = total/cal;
		
		System.out.println(String.format("%.1f MB", result));
		
	}

}
