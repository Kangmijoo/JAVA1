/* [����] 3 6 9 ���α׷�. 1 ���� �� ������ ������� ������ �ΰ� ���� ����ϴµ�, 3 �Ǵ� 6 �Ǵ� 9�� ��� �� �� ��� ���� �빮�� X �� ����Ѵ�.
 * �Է� : 9	-> ��� : 1 2 X 4 5 X 7 8 X	*/
import java.util.Scanner;

public class C1083 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		for(int i = 1; i <= num; i++) {
			if(i % 3 == 0) {
				System.out.print("X ");
			} else {
				System.out.print(i+" ");
			}
		}
		
	}

}
