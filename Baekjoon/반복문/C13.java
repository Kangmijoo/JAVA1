/* [EOF] �� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. (0 < A, B < 10)
 * �Է� : 1 1 \ 2 3 \ 3 4 \ 9 8 \ 5 2	 -> ��� : 2 \ 5 \ 7 \ 17 \ 7		
 * ps : EOF�� End of File�� ���ڷ�, ������ �ҽ��κ��� �� �̻� ���� �� �ִ� �����Ͱ� ������ ��Ÿ���� ���		*/
import java.util.Scanner;

public class C13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//�Էµ� ��ū�� ������ true�� ��ȯ�ϰ�, �׷��� ���� ��� false�� ��ȯ
		while(sc.hasNext()) {	
			int A = sc.nextInt();
			int B = sc.nextInt();
			System.out.println(A+B);
		}

	}

}
