/* � ���� ���� X�� �� �ڸ��� ���������� �̷�ٸ�, �� ���� �Ѽ���� �Ѵ�. ���������� ���ӵ� �� ���� ���� ���̰� ������ ������ ���Ѵ�. 
 * (1<= �Ѽ� <= N) �Ѽ��� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�. (N <= 1000)
 * �Է� : 110	 -> ��� : 99	 / �Է� : 1	-> ��� : 1	/ �Է� : 210	-> ��� : 105	 / �Է� : 1000	-> ��� : 144	*/
import java.util.Scanner;

public class C03_1065 {
	/* �Ѽ����� �����ϰ� �Ѽ��̸� ������ ���� �Լ� */
	public static int CheckHanNum(int num) {
		int CheckHanNum = 0;
		
		//100~num������ ���ڸ� ���
		for(int i = 100; i <= num; i++) {
			int num1 = i/100;
			int num2 = i%100/10;
			int num3 = i%10;
			//�Ѽ��̸� CheckHanNum�� +1�� ����
			if((num3 + num1)*1.0/2 == num2) {
				CheckHanNum++;
			}
		}
		
		return CheckHanNum;
	}
	
	/* ����ؿ� �Ѽ��� ������ ��� */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		sc.close();
		
		// �Է¹��� X���� CheckHanNum�Լ����� ����ؿͼ� result�� ����
		int result = CheckHanNum(X);	
		if(X > 99) {	//X�� 100�̻��̸� �Լ����� ����ؿ� �� + 99�ؼ� ��� ->1~99���� �Լ����� ��� ���߱� ����
			result += 99;
		} else {	//X�� 100�̸��� ���� �Է°� �״�� ���
			result = X;
		}
		
		//���
		System.out.println(result);
	}

}
