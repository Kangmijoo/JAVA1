/* ���ڿ� S, �� ���ڸ� R�� �ݺ��� �� ���ڿ� P�� ���� �� ����ϴ� ���α׷��� �ۼ�. ù ��° ���ڸ� R�� �ݺ�, �� ��° ���ڸ� R�� �ݺ��ϴ� ������ P�� ����� ��.
 * �׽�Ʈ ���� T(1 �� T �� 1,000), �ݺ� Ƚ�� R(1 �� R �� 8), ���ڿ� S�� ���̴� ��� 1�̸�, 20���ڸ� ���� ����.
 * �Է� : 2 \ 3 ABC \ 5 /HTP	-> ��� : AAABBBCCC \ /////HHHHHTTTTTPPPPP	*/
import java.util.Scanner;

public class C04_2675 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i = 0; i < T; i++) {
			int R = sc.nextInt();	//�ݺ��� Ƚ��
			String S = sc.next();	//�ݺ��� ���ڿ� -> nextline()�� ������� ����ؼ� x
			
			for(int j = 0; j < S.length(); j++) {
				for(int k = 0; k < R; k++) {	//R��ŭ �ݺ��ؼ� ���
					System.out.print(S.charAt(j));
				}
			}
			
			System.out.println();
		}
		
	}

}
