/* [����] 1���� �Է��� �������� 1�� �������� ����ϴ� ���α׷��� �ۼ��ϵ�, 3�� ����� ���� ������� �ʵ��� ������.
 * �Է� : 10	 -> ��� : 1 2 4 5 7 8 10		*/
import java.util.Scanner;

public class C1088 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i = 1; i <= num; i++) {
			if(i % 3 == 0) {
				System.out.print("");
			} else {
				System.out.print(i+ " ");				
			}
		}
		
	}

}
