/* 10진 정수 1개를 입력받아 아스키 문자로 출력해보자. 단, 0 ~ 255 범위의 정수만 입력된다. 
 * 입력 : 65	-> 출력 : A	*/
import java.util.Scanner;

public class C1037 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		char iscii = (char)i;	//정수를 아스키코드(문자)로 캐스팅
		sc.close();
		
		System.out.println(iscii);

	}

}
