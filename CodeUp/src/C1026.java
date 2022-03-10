/* 입력되는 시:분:초 에서 분만 출력해보자. 
 * 입력 : 12:2:3	-> 출력 : 02	*/
import java.util.Scanner;

public class C1026 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] arr = str.split(":");
		
		//String배열을 int로 변환
		int b = Integer.parseInt(arr[1]);
		
		System.out.printf("%d", b);
		
		sc.close();

	}

}
