/* [����/���ý��౸��] �� ���� a, b, c�� �ԷµǾ��� ��, ¦(even)/Ȧ(odd)�� ����غ���. (�Էµ� ������� ¦(even)/Ȧ(odd)�� ���� �ٲ� ���)
 * �Է� : 1 2 8	-> ��� : odd
 *						even
 *						even */
import java.util.Scanner;

public class C1066 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] arr = str.split(" ");
		sc.close();
		
		for(int i = 0; i < arr.length; i++) {
			if(Integer.parseInt(arr[i]) % 2 == 0) {
				System.out.println("even");
			} else {
				System.out.println("odd");
			}
		}
		
	}
	

//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		int c = sc.nextInt();
//		sc.close();
//		
//		if(a % 2 == 0) {
//			System.out.println("even\n");
//		} else {
//			System.out.println("odd\n");
//		}
//		
//		if(b % 2 == 0) {
//			System.out.println("even\n");
//		} else {
//			System.out.println("odd\n");
//		}
//		
//		if(c % 2 == 0) {
//			System.out.println("even\n");
//		} else {
//			System.out.println("odd\n");
//		}
//		
//	}

}
