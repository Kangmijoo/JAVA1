/* ���ĺ� �ҹ���, �빮��, ���� 0-9�� �ϳ��� �־����� ��, �־��� ������ �ƽ�Ű �ڵ尪�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
 * ���ĺ� �ҹ���, �빮��, ���� 0-9 �� �ϳ��� ù° �ٿ� �־�����.
 * �Է� : A  -> ��� : 65	/ �Է� : C  -> ��� : 67	/ �Է� : 0  -> ��� : 48	/ �Է� : 9  -> ��� : 57	
 * ps : �ƽ�Ű�ڵ� ���� �����ڵ�� ����ϰ� �ʹٸ� ���ݰ� �ݴ�� char��� int�� �޾ƿͼ� (char)ch �̷� ������ ���		*/
import java.util.Scanner;

public class C01_11654 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch = sc.nextLine().charAt(0);	//�־��� ���� �ϳ��� ������
		sc.close();
		
		// �ƽ�Ű �ڵ�� ��ȯ�ؼ� ��� 
		System.out.println((int)ch);	
	}

}
