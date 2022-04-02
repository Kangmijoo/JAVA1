/* �ҹ��ڷθ� �̷���� �ܾ� S. ������ ���ĺ��� ���ؼ� �ܾ ���ԵǾ� �ִ� ��� ó�� �����ϴ� ��ġ��, ���Ծȵ� �ִ� ��� -1�� ����ϴ� ���α׷��� �ۼ�
 * �Է� : baekjoon	-> ��� : 1 0 -1 -1 2 -1 -1 -1 -1 4 3 -1 -1 7 5 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1		*/
import java.util.Scanner;

public class C03_10809 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//�迭�� �� �� ��� -1�� �ʱ�ȭ
		int[] arr = new int[26];
		for(int i = 0; i < 26; i++) {	
			arr[i] = -1;		
		}

		//�ܾ� S �޾ƿ���
		String S = sc.nextLine();
		
		//�ܾ� ���ĺ� �� �ϳ��� ��
		for(int i = 0; i < S.length(); i++) {
			int ch = S.charAt(i);
			
			if(arr[ch - 'a'] == -1) {	//���ĺ� �ҹ��� 97���� ����
				arr[ch - 'a'] = i;
			} 
		}
		sc.close();
		
		//�Է� ���� �迭 ���� �ϳ��� ���
		for(int result : arr) {
			System.out.print(result + " ");
		}
				
	}

}
