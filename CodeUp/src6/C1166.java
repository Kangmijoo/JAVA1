/* 어떤 해가 입력되면 그 해가 윤년인지 아닌지 판별하시오. 윤년이면 "yes"를 출력, 윤년이 아니면 "no"를 출력하시오.
 * 윤년 판단 조건) 1. 해(year)가 4의 배수이면서 100의 배수가 아니면 윤년. 2. 400의 배수이면 윤년. 두 조건 중 하나라도 맞으면 윤년이다.
 * 입력 : 2012	-> 출력 : yes		*/
import java.util.Scanner;

public class C1166 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		sc.close();
		
		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
	}

}
