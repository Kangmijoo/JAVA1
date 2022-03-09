//Integer.valueOf()
import java.util.Scanner;

public class C1019_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String clock = sc.next();
		String[] arr = clock.split("\\.");
		
		int A = Integer.valueOf(arr[0]);
		int B = Integer.valueOf(arr[1]);
		int C = Integer.valueOf(arr[2]);
		
		//%04d -> 0: 채워질 문자, 4:총 자리수, d:정수
		System.out.printf("%04d.%02d.%02d", A, B, C);	
		
		sc.close();
	}

}
