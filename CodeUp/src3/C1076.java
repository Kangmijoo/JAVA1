/* [�ݺ����౸��] ������(a ~ z) 1���� �ԷµǾ��� �� �� ���ڱ����� ���ĺ��� ������� ����غ���. 
 * �Է� : f	-> ��� : a b c d e f		*/
import java.util.Scanner;

public class C1076 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch = sc.nextLine().charAt(0);
		char first = 'a';
		
		do {
			System.out.print(first + " ");
			first++;
		} while(first <= ch);
		sc.close();
	}

}
