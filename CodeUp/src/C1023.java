import java.util.Scanner;

public class C1023 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] arr = str.split("[.]");
		
		System.out.printf("%s\n%s", arr[0], arr[1]);
		
		sc.close();
	}
	
	/* ex2 */
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		Double d = sc.nextDouble();
//		sc.close();
//		
//		String[] arr = String.valueOf(d).split("\\.");
//		
//		for(String a : arr) {
//			System.out.println(a);
//		}
//	}

}
