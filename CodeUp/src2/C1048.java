/* [��Ʈ����Ʈ����] ���� 2��(a, b)�� �Է¹޾� a�� 2��b������ ���� ������ ����غ���. (0 <= a <= 10, 0 <= b <= 10) 
 * �Է� : 1 3	 -> ��� : 8	*/
import java.util.Scanner;

public class C1048 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();
		
		System.out.printf("%d", num1<<num2);
//		System.out.println(num1 * (int) Math.pow(2, num2));		//a * 2�� b����
	}

}
