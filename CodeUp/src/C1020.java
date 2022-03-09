import java.util.Scanner;

public class C1020 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();		// 123456-7890123
		String[] arr = str.split("-");
		
		//ex.1
		System.out.printf("%s%s", arr[0], arr[1]);
		
		//ex.2
		/* arr[0] = 123456, arr[1] = 7890123
			123456 출력한 다음 7890123 출력 -> 1234567890123 */
//		for(String a : arr ) {
//			System.out.print(a);
//		}

		sc.close();
	}

}
