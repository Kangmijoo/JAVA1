/* [����/���ý��౸��] ����(����, 0 ~ 100)�� �Է¹޾� �򰡸� ����غ���. (90 ~ 100 : A, 70 ~ 89 : B, 40 ~ 69 : C, 0 ~ 39 : D)
 * �Է� : 73	-> ��� : B	 */
import java.util.Scanner;

public class C1068 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		
		if(a >= 90) {
			System.out.println("A");
		} else if(a < 90 & a >= 70) {
			System.out.println("B");
		} else if(a < 70 & a >= 40) {
			System.out.println("C");
		} else {
			System.out.println("D");
		}
		
	}

}
