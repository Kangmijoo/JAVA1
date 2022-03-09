//Integer.parseInt()
import java.util.Scanner;

public class C1019_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String clock = sc.nextLine();		//2003.4.3
		String[] arr = clock.split("\\.");
		
		int[] arr2 = new int[arr.length];	//3
		
		for(int i = 0; i < arr.length; i++) {
			//parseInt() 메소드로 문자열을 정수형태로 반환
			//arr2[0] = 2003, arr2[1] = 4, arr2[2] = 3
			arr2[i] = Integer.parseInt(arr[i]);		
		}
		
		System.out.printf("%04d.%02d.%o2d", arr[0], arr[1], arr[2]);	//2003.04.03

		sc.close();
	}

}
