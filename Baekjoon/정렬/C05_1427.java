/* �迭�� �����ϴ� ���� ����. ���� �־�����, �� ���� �� �ڸ����� ������������ �����غ���.
 * �Է� : 2143	-> ��� : 4321	/ �Է� : 999998999	-> ��� : 999999998 */
import java.util.Arrays;
import java.util.Scanner;

public class C05_1427 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		sc.close();

		//�ڸ��� ���� �迭�� �־��ֱ�
		int[] num = new int[a.length()];
		for(int i = 0; i < a.length(); i++) {
			num[i] = a.charAt(i) - '0';
		}
		
		//�������� ���� �� ���ڸ����� ��� -> ��������
		Arrays.sort(num);
		for(int i = a.length()-1; i >= 0; i--) {
			System.out.print(num[i]);
		}
	}

}
