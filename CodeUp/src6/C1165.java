/* �౸��� Ÿ���� �� 90���̰�, �����̴� 5�и��� ���� ���� �� �ִ� �ɷ��� ������ �ִ�. 
 * ���� 80�п� ������ �Ǹ� 80�п� ��ٷ� ���� �ְԵǰ� 90���̵Ǹ� ��Ⱑ �ٷ� ����ǹǷ� ���� ���� �� ����. 
 * ���� ���Ÿ�Ӱ� �츮���� ������ �Է����� �־� ����, �����̸� �����ϸ� �츮���� ���� ������ �� ������ ����Ͻÿ�.
 * �Է� : 74 2	-> ��� : 6	*/
import java.util.Scanner;

public class C1165 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int time = sc.nextInt();
		int score = sc.nextInt();
		sc.close();
		
		//90-time-1 : -1�ϴ� ������ ������ 5���� �� 90���� �� ������ �߰� �Ǵ� ���� ����
		//�� �������� +1�� �ϴ� ������ ���Ե� �� ���� �߰�
		int result = ((90-time-1)/5)+1;
		System.out.println(score+result);
	}

}
