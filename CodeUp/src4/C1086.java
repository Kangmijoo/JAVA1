/* [����] �ʿ��� ���� ������ MB ������ �ٲپ� ����Ѵ�. �Ҽ��� ���� ��° �ڸ����� �ݿø��� ��° �ڸ����� ����� �� MB�� ����Ѵ�.
 * w, h, b �� ������ �ΰ� �Էµȴ�. ��, w, h�� ��� �����̰� 1~1024 �̴�. b�� 40������ 4�� ����̴�.
 * �Է� : 1024 768 24	 -> ��� : 2.25 MB	*/
import java.util.Scanner;

public class C1086 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double w = sc.nextDouble();
		double h = sc.nextDouble();
		double b = sc.nextDouble();
		sc.close();
		
		double bit = w * h * b;
		double change = 8 * Math.pow(2, 10) * Math.pow(2, 10);
		double MB = bit / change;
		
		System.out.printf("%.2f MB", MB);
				
	}

}
