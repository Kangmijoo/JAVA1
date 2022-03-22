/* 어떤 정수가 입력되면 %를 붙여 출력하시오. 정수 하나가 입력된다.(범위: 0 ~ 100)
 * 입력 : 35	-> 출력 : 35%		*/
import java.util.Scanner;

public class C1111 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		System.out.println(num +"%");
	}

}
