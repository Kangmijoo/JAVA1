/* ���� n���� �־����� ��, n���� ���� ���ϴ� �Լ��� �ۼ��Ͻÿ�. Java: long sum(int[] a); (Ŭ���� �̸�: Test)
 * a: ���� ���ؾ� �ϴ� ���� n���� ����Ǿ� �ִ� �迭 (0 �� a[i] �� 1,000,000, 1 �� n �� 3,000,000)
 * ���ϰ�: a�� ���ԵǾ� �ִ� ���� n���� ��	*/

public class C01_15596 {

class Test {
	long sum(int[] a) {
		long N = 0;
		
		for(int i = 0; i<a.length; i++) {
			N += a[i];
		}
		return N;
	}; 
}

	public static void main(String[] args) {
		
		
	}

}
