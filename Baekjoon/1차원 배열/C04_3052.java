/* �� �ڿ��� A�� B�� ���� ��, A%B�� A�� B�� ���� ������ �̴�. ���� ���, 7, 14, 27, 38�� 3���� ���� �������� 1, 2, 0, 2�̴�. 
 * �� 10���� �Է�, �̸� 42�� ���� �������� ����. �� ���� ���� �ٸ� ���� �� �� �ִ��� ����ϴ� ���α׷��� �ۼ�. (1,000���� �۰ų� ����, ���� �ƴ� ����)
 * �Է� : 1 \ 2 \ 3 \ 4 \ 5 \ 6 \ 7 \ 8 \ 9 \ 10	-> ��� : 10	
 * ps: �迭 �ߺ��� ���ϱ�	-> HashSet�޼ҵ� ���		*/
import java.util.HashSet;
import java.util.Scanner;

public class C04_3052 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] x = new int[11];
		int[] remain = new int[11];
		for(int i = 1; i < 11; i++) {	
			x[i] = sc.nextInt();	//x�迭�� �ڿ��� �Է¹���
			remain[i] = x[i] % 42;	//remain�迭�� �Է¹��� �ڿ����� 42�� ���� ������ �� ����
		}
		sc.close();
		
		/* HashSet�޼ҵ�� �ߺ��� ������� �ʴ´� */
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i = 1; i < 11; i++) {
			//reamain�迭. �� 10���� ���ڸ� 42�� ���� ������ ������ �־��� -> �ߺ����� ���� -> ���� �ٸ� ���� ������ ����� ����
			set.add(remain[i]);		
		}
		System.out.println(set.size());
		
	}

}
