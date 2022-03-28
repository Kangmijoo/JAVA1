/* �� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. ù° �ٿ� �׽�Ʈ ���̽��� ���� T�� �־�����. (0 < A, B < 10)
 * �� �׽�Ʈ ���̽����� "Case #x: "�� ����� ����, A+B�� ����Ѵ�. �׽�Ʈ ���̽� ��ȣ�� 1���� �����Ѵ�.
 * �Է� : 5 \ 1 1 \ 2 3 \ 3 4 \ 9 8 \ 5 2
 * ��� : Case #1: 2 \ Case #2: 5 \ Case #3: 7 \ Case #4: 17 \ Case #5: 7*/
import java.util.Scanner;

public class C07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[] A = new int[T];
		int[] B = new int[T];
		for(int i = 0; i < T; i++) {
			A[i] = sc.nextInt();
			B[i] = sc.nextInt();
		}
		
		for(int i = 0; i < T; i++) {
			System.out.printf("Case #%d: %d\n", i+1, A[i]+B[i]);
		}
	}

}
