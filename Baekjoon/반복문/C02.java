/* �� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. ù° �ٿ� �׽�Ʈ ���̽��� ���� T�� �־�����.
 * �� �׽�Ʈ ���̽��� �� �ٷ� �̷���� ������, �� �ٿ� A�� B�� �־�����. (0 < A, B < 10)
 * �Է� : 5 / 1 1 / 2 3 / 3 4 / 9 8 / 5 2	  -> ��� : 2 / 5 / 7 / 17 / 7		*/
import java.util.Scanner;

public class C02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//�׽�Ʈ ���̽� ���� �޾ƿ�
		int T = sc.nextInt();
		//���̽� ���� ��ŭ �� ���� ���� �޾ƿ�
		int[] A = new int[T];
		int[] B = new int[T];
		for(int i = 0; i < T; i++) {
			A[i] = sc.nextInt();
			B[i] = sc.nextInt();
		}
		sc.close();
		
		//��� �� ���
		int result;
		for(int i = 0; i < T; i++) {
			result = A[i]+B[i];
			System.out.println(result);
		}
		
	}

}
