/* ���� �Է�. ���� �������� ��ġ n�� 30��n��40 �̰ų� 60��n��70 �̸�, win�� ���, �׿ܿ��� lose�� ����Ѵ�.
 * �Է� : 50	-> ��� : lose	*/
import java.util.Scanner;

public class C1158 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		if((n >= 30 && n <= 40) || (n >= 60 && n <= 70)) {
			System.out.println("win");
		} else {
			System.out.println("lose");
		}
	}

}
