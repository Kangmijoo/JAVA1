/* ���� 2��(a, b)�� �Է¹޾� ��, ��, ��, ��, ������, ���� ���� �ڵ����� ����غ���. (�� 0 <= a, b <= 2147483647, b�� 0�� �ƴϴ�.)
 * �Է� : 10 3 ->	��� : 13
					 7
					 30
					 3
					 1
					 3.33*/
import java.util.Scanner;
public class C1045 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Double num = sc.nextDouble();
		Double num2 = sc.nextDouble();
		
		System.out.printf("%.0f\n", num + num2);
		System.out.printf("%.0f\n", num - num2);
		System.out.printf("%.0f\n", num * num2);
		System.out.printf("%.0f\n", num / num2);
		System.out.printf("%.0f\n", num % num2);
		System.out.printf("%.2f", num / num2);
	}

}
