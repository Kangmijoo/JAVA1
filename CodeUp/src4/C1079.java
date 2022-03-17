/* [종합] 'q'가 입력될 때까지 입력한 문자를 계속 출력하는 프로그램을 작성해보자. 
 * 입력 : x b k d l q g a c	-> 출력 : x
									b
									k
									d
									l
									q	*/
import java.util.Scanner;
	
public class C1079 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char a;
		while (true) {
			a = sc.next().charAt(0);
			System.out.println(a);
			if(a == 'q') {
				break;
			}
		}
		sc.close();
	}

}
