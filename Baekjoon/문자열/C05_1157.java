/* ���ĺ� ��ҹ��ڷ� �� �ܾ �־�����, ���� ���� ���� ���ĺ��� �������� �˾Ƴ��� ���α׷��� �ۼ�. ��, �빮�ڿ� �ҹ��ڸ� �������� ����.
 * �־����� �ܾ��� ���̴� 1,000,000�� ���� ����. ù° �ٿ� ���� ���� ���� ���ĺ��� �빮�ڷ� ���. ��, ���� ���� ���� ���ĺ��� ���� �� �����ϴ� ��� ?�� ���.
 * �Է� : Mississipi	-> ��� : ?	/ �Է� : zZa	-> ��� : Z	/ �Է� : z	-> ��� : Z	/ �Է� : baaa	 -> ��� : A	*/
import java.util.Arrays;
import java.util.Scanner;

public class C05_1157 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/* �⺻���� ��� �ڸ��� 0 �־��� -> 0���� �����ؼ� �ݺ��� ������ 1�� �߰�*/
		int[] arr = new int[26];
		for(int j = 0; j < 26; j++) {
			arr[j] = 0;
		}
		
		/* �빮�ڷ� �Է¹��� */
		String str = sc.nextLine().toUpperCase();	
		sc.close();
		
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			arr[ch - 65] += 1;		//�Է¹��� ���ĺ��� �׿� �´� �迭 ��ġ�� 1�� ����
		}
		
		/* ���� ū ��(max) ã���ֱ� -> max�� �ߺ��̸� ? ��� */
		int max = -1;		//������ ���ϰ� ���� ū �� �־��� ����
		char result = '-';	//����� ����� �� �־��� ����
		
		for(int i = 0; i < 26; i++) {
			if(arr[i] > max) {			//���� ���� �ݺ��� Ƚ�� ��ġ char�� ��ȯ�ؼ� ���
				max = arr[i];
				result = (char)(i+65);
			} else if(arr[i] == max) {	//�ݺ�Ƚ�� ��ĥ ��
				result = '?';
			}
		}
		
		/* ��� */
		System.out.println(result);
	}

}
