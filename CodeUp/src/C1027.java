/* 년월일을 출력하는 방법은 나라마다, 형식마다 조금씩 다르다.
 * 년월일(yyyy.mm.dd)를 입력받아, 일월년(dd-mm-yyyy)로 출력해보자.
 * (단, 한 자리 일/월은 0을 붙여 두자리로, 년도도 0을 붙여 네자리로 출력한다.) 
 */
import java.util.Scanner;

public class C1027 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] arr = str.split("\\.");
		
		int y = Integer.parseInt(arr[0]);
		int m = Integer.parseInt(arr[1]);
		int d = Integer.parseInt(arr[2]);
		
		System.out.printf("%02d-%02d-%02d", d, m, y);
		
		sc.close();

	}
	
	// ex2
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String str = sc.nextLine();
//		sc.close();
//		
//		String[] arr = str.split("\\.");
//		int[] arr1 = new int[arr.length];		//arr의 길이에 맞춰 int형 배열 선언
//		
//		for(int i = 0; i < arr.length; i++) {
//			arr1[i] = Integer.parseInt(arr[i]);		//정수형으로 변환
//		}
//		
//		System.out.printf("%02d-%02d-%04d", arr1[2], arr1[1], arr1[0]);
//
//	}

}
