/* (����) 1. ���� ��ġ�� 50m~70m�̸� ���Ⱑ �̱�. �Ǵ� 2. ���� ��ġ�� 6�� ����̸� ���Ⱑ �̱�. 
 * ���Ⱑ ���� ���� ��ġ�� �Է����� �־����� ���Ⱑ �̱�� �������� "win"�� ����ϰ�, �� �ܿ��� "lose"�� ����Ͻÿ�.
 * �Է� : 30	-> ��� : win		*/
import java.util.Scanner;

public class C1159 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		if((n >= 50 && n <= 70) || n % 6 == 0) {
			System.out.println("win");
		} else {
			System.out.println("lose");
		}
	}

}
