/* 정수 입력. 공이 떨어지는 위치 n이 30≤n≤40 이거나 60≤n≤70 이면, win을 출력, 그외에는 lose를 출력한다.
 * 입력 : 50	-> 출력 : lose	*/
import java.util.Scanner;

public class C1158 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		if((n >= 30 && n <= 40) || (n >= 60 && n <= 70)) {
			System.out.println("win");
		} else {
			System.out.println("lose");
		}
	}

}
