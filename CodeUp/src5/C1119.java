/* 하루는 24시간이다. 일(day)이 입력으로 주어지면 시간으로 변환하시오.
 * 입력 : 2	-> 출력 : 48		*/
import java.util.Scanner;

public class C1119 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int day = sc.nextInt();
		sc.close();
		
		System.out.println(day*24);
	}

}
