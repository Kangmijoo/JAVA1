/* [�ݺ����౸��] n���� ������ ������� �Էµȴ�. -2147483648 ~ +2147483647, �� n�� �ִ� ������ �� �� ����.
 * n���� �Էµ� ������ ������� ����غ���. while( ), for( ), do~while( ) ���� �ݺ����� ����� �� ����.
 * �Է� : 5			 -> ��� : 1
		1 2 3 4 5  			 2
							 3
							 4
							 5		*/
import java.util.Scanner;

public class C1072 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int a;
		
		for(int i=0; i<count; i++) {
			a = sc.nextInt();
			System.out.println(a);
		}
		sc.close();
	}

}
