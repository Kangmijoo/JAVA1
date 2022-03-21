/* [2�����迭] �������� ����(h), ����(w), ������ ����(n), �� ������ ����(l), ���븦 ���� ����(d:���δ� 0, ���δ� 1)��
 * ���븦 ���� ������ ���� ���� �Ǵ� ������ ��ġ(x, y)�� �־��� ��, �������� ä�� ������ ����� ����ϴ� ���α׷��� ������.
 * ù �ٿ� �������� ����(h), ����(w)�� ������ �ΰ� �Է�, �� ��° �ٿ� ������ ����(n) �� ��° �ٺ��� �� ������ ����(l), ����(d), ��ǥ(x, y)�� �Է�.
 * �Է� : 5 5			-> ��� : 1 1 0 0 0
		3					0 0 1 0 1
		2 0 1 1				0 0 1 0 1
		3 1 2 3				0 0 1 0 1
		4 1 2 5				0 0 0 0 1	*/
import java.util.Scanner;

public class C1098 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//
		int h = sc.nextInt();
		int w = sc.nextInt();
		int[][] arr = new int[h+1][w+1];
		
		//
		int n = sc.nextInt();		
		for(int i = 0; i < n; i++) {
			int l = sc.nextInt();
			int d = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			if(d == 0) {	//
				for(int j = 0; j < l; j++) {
					arr[x][y+j] = 1;
				}
			} else {		//
				for(int j = 0; j < l; j++) {
					arr[x+j][y] = 1;
				}
			}
		}
		
		//
		for(int i = 1; i <= h; i++) {
			for(int j = 1; j <= w; j++) {
				System.out.print(arr[i][j] +" ");
			}
			System.out.println();
		}
		
	}

}
