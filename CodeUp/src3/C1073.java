/* [�ݺ����౸��] ������ ������� �Էµȴ�. -2147483648 ~ +2147483647, �� ������ �� �� ����. 
 * 0�� �ƴϸ� �Էµ� ������ ����ϰ�, 0�� �ԷµǸ� ����� �ߴ��غ���.
 * �Է� : 7 4 2 3 0 1 5 6 9 10 8	 -> ��� : 7
										 4
										 2
										 3	*/
import java.util.Scanner;

public class C1073 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int i = sc.nextInt();
			if(i != 0) {
				System.out.println(i);
			} else {
				break;
			}
		}
		sc.close();
	}

}
