/* ��ǥ�� (12, 5)�� �� A�� x��ǥ�� y��ǥ�� ��� ����̹Ƿ� ��1��и鿡 ���Ѵ�. �� B�� x��ǥ�� �����̰� y��ǥ�� ����̹Ƿ� ��2��и鿡 ���Ѵ�.
 * ���� ��ǥ�� �Է¹޾� �� ���� ��� ��и鿡 ���ϴ��� �˾Ƴ��� ���α׷��� �ۼ��Ͻÿ�. (��, x��ǥ�� y��ǥ�� ��� ����� ������� �����Ѵ�.)
 * �Է� : 12 \ 5	-> ��� : 1	*/
import java.util.Scanner;

public class C4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		sc.close();
		
		if(x > 0) {		//x�� ��� -> 1��и� or 4��и�
			if(y > 0) {
				System.out.println(1);
			} else {
				System.out.println(4);
			}
		} else {		//x�� ��� -> 2��и� or 3��и�
			if(y > 0) {
				System.out.println(2);
			} else {
				System.out.println(3);
			}
		}
	}

}
