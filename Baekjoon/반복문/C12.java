/* �� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
 * �� �׽�Ʈ ���̽��� �� �ٷ� �̷���� ������, �� �ٿ� A�� B�� �־�����. (0 < A, B < 10)�Է��� ���������� 0 �� ���� ���´�.
 * �Է� : 1 1 \ 2 3 \ 3 4 \ 9 8 \ 5 2 \ 0 0	-> ��� : 2 \ 5 \ 7 \ 17 \ 7		
 * ps : ��� �Է� ���� ���� �ѹ��� ����� ���;� �ϴ� �� �˾Ҵµ�, 0 0�� ������ �������� �Է��ϰ� ����޴� ����� �ݺ��ص� �ǳ�����.	*/
import java.util.Scanner;

public class C12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		int[] A = new int[100];
		int[] B = new int[100];
		//A�� B�� ��� 0�� ���� �� ���� �Է¹���
		while(true) {
			A[i] = sc.nextInt();
			B[i] = sc.nextInt();
			if(A[i] == 0 && B[i] == 0) {
				break;
			}
			i++;			
		}
		sc.close();
		
		//�Է� ���� �迭�� ���
		for(int j = 0; j < i; j++) {
			System.out.println(A[j]+B[j]);
		}
		
		/*ex2 - 0 0�� ������ ������ �Է°� ����� �ݺ��ϴ� ���*/
//		while(true) {
//			int A = sc.nextInt();
//			int B = sc.nextInt();
//			if(A == 0 && B == 0) {
//				sc.close();
//				break;
//			}
//			System.out.println(A+B);
//		}
	}

}
