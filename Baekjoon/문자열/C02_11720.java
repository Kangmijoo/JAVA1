/* N���� ���ڰ� ���� ���� �����ְ� �� ���ڸ� ��� ���ؼ� ����ϴ� ���α׷��� �ۼ�. ù° �ٿ� ������ ���� N(1 �� N �� 100). ��° �ٿ� ���� N���� ������� �־���.
 * �Է� : 1 \ 1	-> ��� : 1	-> �Է� : 5 \ 54321	-> ��� : 15	/ �Է� : 11 \ 10987654321	-> ��� : 46	
 * ps: �Է� ���� ���� 100�ڰ� �� �� �ֱ� ������ �ڷ��� ������ �� ���� / char to int -> Character.getNumericValue()���	*/
import java.util.Scanner;

public class C02_11720 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		String a = sc.nextLine();
		sc.close();
		
		int sum = 0;		//���ڸ��� ���� �� ������ ����
		char result = 0;	//��� �� ���� ����
		
		while(N > 0) {
			result = a.charAt(a.length() - 1);	//������ ���ڸ� ����
			//������ ������ ���� sum���ٰ� �ݺ��� ������ ������
			sum += Character.getNumericValue(result);
			a = a.substring(0, a.length()-1);	//������ ���� ����
			N--;
		}
		
		//���
		System.out.println(sum);
	}

}
