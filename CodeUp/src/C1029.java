/* 실수 1개를 입력받아 그대로 출력해보자. (단, 입력되는 실수의 범위는 +- 1.7*10-308 ~ +- 1.7*10308 이다.) 
 * 입력된 실수를 소수점 이하 11자리까지 반올림하여 출력한다.
 * 입력 : 3.14159265359	-> 출력 : 3.14159265359	*/
import java.util.Scanner;

public class C1029 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double i = sc.nextDouble();
		
		System.out.printf("%.11f", i);
//ex2.	System.out.println(String.format("%.11f", i));

		sc.close();
	}

}
