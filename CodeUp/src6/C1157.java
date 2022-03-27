/* 실수 입력. 50이상 60이하이면 win을 출력, 그 외에는 lose를 출력하시오.
 * 입력 : 50.213	-> 출력 : win		*/
import java.util.Scanner;

public class C1157 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double d = sc.nextDouble();
		sc.close();
		
		if(d >= 50 && d <= 60) {
			System.out.println("win");
		} else {
			System.out.println("lose");
		}
	}

}
