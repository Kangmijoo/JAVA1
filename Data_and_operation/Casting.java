//Casting
public class Casting {

	public static void main(String[] args) {

		double a = 1.1;
		double b = 1;	//�ս��� ���� ������ �ڵ����� casting (1�̳� 1.0�̳� �ս��� ����)
		double b2 = (double) 1;
		System.out.println(b);

//		int c = 1.1;
		double d = 1.1;
		int e = (int) 1.1;	//double���� int�� �ٲٸ� �ս��� �ֱ� ������ ��������� �� ��ȯ�� �ؾ� ��. (1.1->1.0�� �Ƿ��� 0.1�� ���ư�)
		System.out.println(e);
		
		// 1 to String ���̻� ���ڰ� �ƴ϶� ���ڿ�
		String f = Integer.toString(1);
		System.out.println(f.getClass());	//.getClass() -> �տ� ���� �ִ� ������ ��(f)�� � Ÿ������ �˷� ��.
		
	}

}
