/* ���� 2��(a, b) �� �Է¹޾� a�� b�� ���� �������� ����غ���. (��, 0 <= a, b <= +2147483647, b�� 0�� �ƴϴ�.)
 * �Է� : 10 3	-> ��� : 1	*/
import java.util.Scanner;
public class C1043 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();
		
		System.out.println(num1 % num2);
	}

}
