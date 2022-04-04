/* �� ���� �ڿ��� A, B, C�� �־��� �� A �� B �� C�� ����� ����� 0���� 9���� ������ ���ڰ� �� ���� ���������� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * ���� ��� A = 150, B = 266, C = 427 �̶�� A �� B �� C = 150 �� 266 �� 427 = 17037300 �� �ǰ�, 
 * ����� ��� 17037300 ���� 0�� 3��, 1�� 1��, 3�� 2��, 7�� 2�� ������. 1���� 9������ ���ڰ� ���� �� �� �������� ���ʷ� �� �ٿ� �ϳ��� ���
 * �Է� : 150 \ 266 \ 427	 -> ��� : 3 \ 1 \ 0 \ 2 \ 0 \ 0 \ 0 \ 2 \ 0 \ 0		*/
import java.util.Scanner;

public class C03_2577 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String gob = String.valueOf(sc.nextInt()*sc.nextInt()*sc.nextInt());
		sc.close();
		
		/*�迭 1~9 ��� 0���� �ʱ�ȭ*/
		int[] cal = new int[10];
		for(int i = 0; i < cal.length; i++) {
			cal[i] = 0;
		}
		
		/*��� ��� ���ڸ��� �����ͼ� �ش�Ǵ� �迭 ��ġ�� �ϳ��� +1*/
		for(int i = 0; i < gob.length(); i++) {
			char x = gob.charAt(i);
			cal[x - '0']++;		//char�̴ϱ� int������ ��ȯ�ؼ� �־���� ��
		}
		
		/*���*/
		for(int i = 0; i <= 9; i++) {
			System.out.println(cal[i]);
		}
		
	}

}
