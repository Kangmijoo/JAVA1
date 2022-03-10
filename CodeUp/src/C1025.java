/* 다섯 자리의 정수 1개를 입력받아 각 자리별로 나누어 출력한다. 입력 : 75254
 * [70000]
 * [5000]
 * [200]
 * [50]
 * [4]
 */
import java.util.Scanner;

public class C1025 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] arr = sc.nextLine().split("");
		
		System.out.println("[" +arr[0]+ "0000]");
		System.out.println("[" +arr[1]+ "000]");
		System.out.println("[" +arr[2]+ "00]");
		System.out.println("[" +arr[3]+ "0]");
		System.out.println("[" +arr[4]+ "]");

		sc.close();
	}
	
	/* ex2 */
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String str = sc.nextLine();
//		char[] arr = str.toCharArray();
//		
//		for(int i = 0; i < arr.length; i++) {
//			System.out.print("[" +arr[i]);
//			for(int j = arr.length-1; j > i; j--) {
//				System.out.print("0");
//			}
//			System.out.println("]");
//		}
//		 sc.close();
//	}

}
