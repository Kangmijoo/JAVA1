/* [����/���ý��౸��] ���� 1���� �ԷµǾ��� ��, �Էµ� ������ ���� ù �ٿ� minus�� plus�� ����ϰ�, �� ��° �ٿ� odd �� even �� ����Ѵ�. 
 * �Է� : -2147483648	 -> ��� : minus
 * 							 even	*/
import java.util.Scanner;

public class C1067 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		
		if(a > 0) {
			System.out.println("plus");
		} else {
			System.out.println("minus");
		}
		
		if(a % 2 == 0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}
		
	}

}
