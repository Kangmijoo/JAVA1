/* ��ҹ��ڿ� �������� �̷���� ���ڿ�. ���ڿ����� �� ���� �ܾ ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�. �� �ܾ ���� �� �����ϸ� ������ Ƚ����ŭ ��� ����� ��.
 * ���ڿ��� ���̴� 1,000,000�� ���� �ʴ´�. �ܾ�� ���� �� ���� ���еǸ�, ������ �����ؼ� ������ ���� ����. ���� ���ڿ��� �������� �����ϰų� ���� �� �ִ�.
 * �Է� : The Curious Case of Benjamin Button	 -> ��� : 6
 * �Է� :  The first character is a blank  -> ��� : 6	  / �Է� : The last character is a blank 	-> ��� : 6		
 * ps : ���� �Է��� �ٷ� ����� �� ���� ����		*/
import java.util.Scanner;

public class C06_1152 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] arr = str.split(" ");
		sc.close();
		
		if (arr.length == 0) {	//���鸸 �Է��ϰ� �ٷ� ����� ���
			System.out.println(0);
			System.exit(0); 	//���α׷� ���� ����
		}
		
		if(arr[0].isEmpty()) {	//�������� ������ ���
			System.out.println(arr.length-1);
		} else {		//���ڷ� �����ϴ� ��� || ���� ������ ���� ���
			System.out.println(arr.length);
		}
		
	}

}
