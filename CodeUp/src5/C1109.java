/* 이름, 나이, 부서코드, 보안키를 순서대로 줄을 바꿔 출력  1. 첫째 줄에 이름을 입력한다.(영문자 20 문자이내) 2. 다음 줄에 나이를 입력한다.(정수)
 * 3. 다음 줄에 부서코드 A, B, C 중 하나를 입력한다.(영문자) 4. 다음 줄에 보안키를 입력한다.(실수)
 * 입력 : mark \ 20 \ A \ 3.154	-> 출력 : mark \ 20 \ A \ 3.154	*/
import java.util.Scanner;

public class C1109 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		int age = sc.nextInt();
		char code = sc.next().charAt(0);
		double key = sc.nextDouble();
		sc.close();
		
		System.out.printf(name +"\n"+ age +"\n"+ code +"\n"+ key);

	}

}
