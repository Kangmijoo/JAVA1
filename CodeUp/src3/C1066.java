/* [조건/선택실행구조] 세 정수 a, b, c가 입력되었을 때, 짝(even)/홀(odd)을 출력해보자. (입력된 순서대로 짝(even)/홀(odd)을 줄을 바꿔 출력)
 * 입력 : 1 2 8	-> 출력 : odd
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
