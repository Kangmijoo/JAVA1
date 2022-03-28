/* �Է��� �ð����� 45�� ���� �ð� ���(0 �� H �� 23, 0 �� M �� 59). ������ ���� �˶� �ð� H�� M���� �ǹ��Ѵ�. �Է� �ð��� 24�ð� ǥ���� ����Ѵ�. 
 * 24�ð� ǥ������ �Ϸ��� ������ 0:0(����)�̰�, ���� 23:59(������ ���� 1�� ��)�̴�. �ð��� ��Ÿ�� ��, ���ʿ��� 0�� ������� �ʴ´�.
 * �Է� : 10 10	-> ��� : 9 25 / �Է� : 0 30	-> ��� : 23 45	*/
import java.util.Scanner;

public class C5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();
		sc.close();
		
		//��� ���� ������ ��Ÿ��
		int result = (H*60+M)-45;	
		
		//��� ���� �ÿ� ������ ����
		int hour, min;
		if(H == 0 && M < 45) {	//�Է� �ð��� 0�� ~ 0�� 44��
			hour = 23;
			min = 60+result;
		} else {				//������
			hour = result/60;
			min = result%60;			
		}
		
		System.out.printf("%d %d", hour, min);
		
	}

}
