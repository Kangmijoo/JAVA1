/* ���� N���� �̷���� ���� A�� ���� X�� �־�����. �̶�, A���� X���� ���� ���� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * (1 �� N, X �� 10,000)��° �ٿ� ���� A�� �̷�� ���� N���� �־�����. 
 * X���� ���� ���� �Է¹��� ������� �������� ������ ����Ѵ�. X���� ���� ���� ��� �ϳ� �����Ѵ�.
 * �Է� : 10 5 \ 1 10 4 9 2 3 8 5 7 6	 -> ��� : 1 4 2 3	*/
import java.util.Scanner;

public class C11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		int[] A = new int[N];
		
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
			if(A[i] < X) {
				System.out.print(A[i] +" ");
			}
		}
		sc.close();
		
	}

}
