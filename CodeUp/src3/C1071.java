/* [�ݺ����౸��] ������ ������� �Էµȴ�. -2147483648 ~ +2147483647, �� ������ �� �� ����.
 * 0�� �ƴϸ� �Էµ� ������ ����ϰ�, 0�� �ԷµǸ� ����� �ߴ��غ���. while( ), for( ), do~while( ) ���� �ݺ����� ����� �� ����.
 * �Է� : 7 4 2 3 0 1 5 6 9 10 8	 -> ��� : 7
										 4
										 2
										 3	*/
import java.util.Scanner;

public class C1071 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int a = sc.nextInt();
			if(a == 0) {
				break;
			}
			System.out.println(a);
		}
		sc.close();
	}

}
