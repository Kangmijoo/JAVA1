/* 9���� ���� �ٸ� �ڿ����� �־��� ��, �̵� �� �ִ��� ã�� �� �ִ��� �� ��° �������� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * ù° �ٺ��� ��ȩ ��° �ٱ��� �� �ٿ� �ϳ��� �ڿ����� �־�����. �־����� �ڿ����� 100 ���� �۴�.
 * �Է� : 3 \ 29 \ 38 \ 12 \ 57 \ 74 \ 40 \ 85 \ 61	-> ��� : 85 \ 8		*/
import java.util.Arrays;
import java.util.Scanner;

public class C02_2562 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] x = new int[9];
		//x�迭�� 9���� �ڿ��� �� �ޱ�
		for(int i = 0; i < 9; i++) {
			x[i] = sc.nextInt();
		}

		//stream�� �̿��� �迭 �� ���� ū �� ���ϱ�
		int max = Arrays.stream(x).max().getAsInt();
		
		//max�� �迭���� ���° ������ ���ϱ�
		int num = 0;
		for(int i = 0; i < 9; i++) {
			if(x[i] == max) {
				num = i+1;
				break;
			}
		}
		
		// ���
		System.out.printf("%d\n%d", max, num);
	}

}
