/* 0.3 �� 86 + 0.3 �� 90 + 0.4 �� 85 = 86.8 �̷� ������� �� ������ ������ ���. 
 * �ݿ������� ������ �˰� ���� �� �� ������ ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * �Է� : 0.3 50 \ 0.4 80 \ 0.3 92	-> ��� : 74.6	*/
import java.util.Scanner;

public class C1127 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double sum = 0;
		for(int i = 0; i < 3; i++) {
			double ratio = sc.nextDouble();
			double score = sc.nextDouble();
			sum += ratio*score;
		}
		sc.close();
		System.out.printf("%.1f", sum);
	}

}
